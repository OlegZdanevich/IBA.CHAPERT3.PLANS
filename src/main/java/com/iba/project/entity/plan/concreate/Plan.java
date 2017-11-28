package com.iba.project.entity.plan.concreate;

import com.iba.project.entity.field.Field;
import com.iba.project.entity.plan.abstraction.classes.AbstractPlan;
import com.iba.project.patterns.observer.Observer;

import java.util.LinkedList;
import java.util.List;

public class Plan extends AbstractPlan<Plan> {

    private Field priceToCallsAndInternet = null;
    private Field freeMinutesAndInternet = null;

    private List<Observer> observers;


    public Plan(String name, int price) {
        super(name, price);

        priceToCallsAndInternet = new Field(0, 0);
        freeMinutesAndInternet = new Field(0L, 0L);

        observers = new LinkedList<>();
    }

    public Plan(Plan plan) {
        super(plan.getName(), plan.getPrice());

        priceToCallsAndInternet = new Field(plan.getPriceToCalls(), plan.getPriceToInternet());
        freeMinutesAndInternet = new Field(plan.getFreeMinutes(), plan.getFreeInternet());

        observers = new LinkedList<>();
    }

    @Override
    public int getPrice() {
        return super.getPrice();
    }

    @Override
    public String getName() {
        return super.getName();
    }


    public long getFreeMinutes() {
        return (long) freeMinutesAndInternet.getCalls();
    }

    public long getFreeInternet() {
        return (long) freeMinutesAndInternet.getInternet();
    }

    public int getPriceToCalls() {
        return (int) priceToCallsAndInternet.getCalls();
    }

    public int getPriceToInternet() {
        return (int) priceToCallsAndInternet.getInternet();
    }

    public void setFreeMinutesAndInternet(long minutes, long internet) {
        Plan oldPlan = new Plan(this);

        freeMinutesAndInternet.setCalls(minutes);
        freeMinutesAndInternet.setInternet(internet);

        notifyObservers(oldPlan, this);
    }

    public void setPriceToCallsAndInternet(int minutes, int internet) {
        Plan oldPlan = new Plan(this);

        priceToCallsAndInternet.setCalls(minutes);
        priceToCallsAndInternet.setInternet(internet);

        notifyObservers(oldPlan, this);
    }

    @Override
    public void setPrice(int price) {

        Plan oldPlan = new Plan(this);


        super.setPrice(price);

        notifyObservers(oldPlan, this);

    }

    @Override
    public void setName(String name) {
        Plan oldPlan = new Plan(this);

        super.setName(name);
        notifyObservers(oldPlan, this);
    }






    @Override
    public String toString() {
        String result = super.toString();

        String priceHeader = ((int) priceToCallsAndInternet.getCalls() != 0 || (int) priceToCallsAndInternet.getInternet() != 0)
                ? "Prices(min,mb): " + priceToCallsAndInternet.toString() + "\n" : "";

        String freeHeader = ((long) freeMinutesAndInternet.getCalls() != 0 || (long) freeMinutesAndInternet.getInternet() != 0)
                ? "Free (min,mb): " + freeMinutesAndInternet.toString() + "\n" : "";

        result += priceHeader;
        result += freeHeader;
        return result;
    }

    @Override
    public void registerObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        observers.remove(o);
    }


    @Override
    public void notifyObservers(Plan oldPlan, Plan newPlan) {
        for (Observer observer : observers)
            observer.update(oldPlan, newPlan);
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Plan)) return false;
        if (!super.equals(o)) return false;

        Plan plan = (Plan) o;

        if (!priceToCallsAndInternet.equals(plan.priceToCallsAndInternet)) return false;
        return freeMinutesAndInternet.equals(plan.freeMinutesAndInternet);
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + priceToCallsAndInternet.hashCode();
        result = 31 * result + freeMinutesAndInternet.hashCode();
        return result;
    }
}
