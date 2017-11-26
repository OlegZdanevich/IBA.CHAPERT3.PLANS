package com.iba.project.entity.plan.concreate;

import com.iba.project.entity.field.Field;
import com.iba.project.entity.plan.abstraction.classes.AbstractPlan;

public class Plan extends AbstractPlan {

    private Field priceToCallsAndInternet = null;
    private Field freeMinutesAndInternet = null;

    public Plan(String name, int price, long numberOfUsers) {
        super(name, price, numberOfUsers);

        priceToCallsAndInternet = new Field(0, 0);
        freeMinutesAndInternet = new Field(0L, 0L);
    }

    @Override
    public int getPrice() {
        return super.getPrice();
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public long getNumberOfUsers() {
        return super.getNumberOfUsers();
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
        freeMinutesAndInternet.setCalls(minutes);
        freeMinutesAndInternet.setInternet(internet);
    }

    public void setPriceToCallsAndInternet(int minutes, int internet) {
        priceToCallsAndInternet.setCalls(minutes);
        priceToCallsAndInternet.setInternet(internet);
    }

    @Override
    public void setPrice(int price) {
        super.setPrice(price);
    }

    @Override
    public void setName(String name) {
        super.setName(name);
    }

    @Override
    public void setNumberOfUsers(long numberOfUsers) {
        super.setNumberOfUsers(numberOfUsers);
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

    @Override
    public String toString() {
        String result=super.toString();

        String priceHeader=((int)priceToCallsAndInternet.getCalls()!=0|| (int) priceToCallsAndInternet.getInternet()!=0)
                ?"Prices(min,mb): "+priceToCallsAndInternet.toString()+"\n":"";

        String freeHeader=((long)freeMinutesAndInternet.getCalls()!=0|| (long) freeMinutesAndInternet.getInternet()!=0)
                ?"Free (min,mb): "+freeMinutesAndInternet.toString()+"\n":"";

        result+=priceHeader;
        result+=freeHeader;
        return result;
    }
}
