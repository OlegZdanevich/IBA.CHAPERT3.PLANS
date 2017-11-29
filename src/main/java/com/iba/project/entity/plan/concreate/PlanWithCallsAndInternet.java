package com.iba.project.entity.plan.concreate;

import com.iba.project.entity.plan.abstraction.classes.AbstractPlan;
import com.iba.project.entity.plan.abstraction.interfaces.PlanWithCallsInterface;
import com.iba.project.entity.plan.abstraction.interfaces.PlanWithInternetInterface;

public class PlanWithCallsAndInternet extends AbstractPlan implements PlanWithInternetInterface,PlanWithCallsInterface{

    private int priceOfCalls;
    private int priceOfInternet;


    public PlanWithCallsAndInternet(String cellularName, String name, int price) {
        super(cellularName, name, price);

    }


    public PlanWithCallsAndInternet(PlanWithCallsAndInternet planWithCallsAndInternet) {
        super(planWithCallsAndInternet.getCellularName(), planWithCallsAndInternet.getName(), planWithCallsAndInternet.getPrice());


        this.priceOfCalls=planWithCallsAndInternet.priceOfCalls;
        this.priceOfInternet=planWithCallsAndInternet.priceOfInternet;
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
    public int getPriceOfInternet() {
        return priceOfInternet;
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
    public void setPriceOfInternet(int priceOfInternet) {
        this.priceOfInternet = priceOfInternet;
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
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof PlanWithCallsAndInternet)) return false;
        if (!super.equals(o)) return false;

        PlanWithCallsAndInternet that = (PlanWithCallsAndInternet) o;

        if (getPriceOfCalls() != that.getPriceOfCalls()) return false;
        return getPriceOfInternet() == that.getPriceOfInternet();
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + getPriceOfCalls();
        result = 31 * result + getPriceOfInternet();
        return result;
    }

    @Override
    public String toString() {
        String result = super.toString()+"\nprice Of calls: "+this.priceOfCalls+"\nprice Of internet: "+this.priceOfInternet;

        return result;
    }

}
