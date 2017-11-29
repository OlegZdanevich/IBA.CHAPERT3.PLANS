package com.iba.project.entity.plan.concreate;

import com.iba.project.entity.plan.abstraction.classes.AbstractPlan;
import com.iba.project.entity.plan.abstraction.interfaces.PlanWithCallsInterface;

public class PlanWithCalls extends AbstractPlan implements PlanWithCallsInterface {

    private int priceOfCalls;


    public PlanWithCalls(String cellularName, String name, int price) {
        super(cellularName, name, price);

    }

    public PlanWithCalls(PlanWithCalls planWithCalls) {
        super(planWithCalls.getCellularName(), planWithCalls.getName(), planWithCalls.getPrice());


        this.priceOfCalls=planWithCalls.priceOfCalls;
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
    public int getPriceOfCalls() {
        return priceOfCalls;
    }

    @Override
    public String getCellularName() {
        return super.getCellularName();
    }


    @Override
    public void setCellularName(String cellularName) {
        super.setCellularName(cellularName);
    }

    @Override
    public void setPriceOfCalls(int priceOfCalls) {
        this.priceOfCalls = priceOfCalls;
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
    public String toString() {
        String result = super.toString()+"\nprice Of calls: "+this.priceOfCalls;

        return result;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof PlanWithCalls)) return false;
        if (!super.equals(o)) return false;

        PlanWithCalls that = (PlanWithCalls) o;

        return priceOfCalls == that.priceOfCalls;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + priceOfCalls;
        return result;
    }
}
