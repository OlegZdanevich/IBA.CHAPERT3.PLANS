package com.iba.project.entity.plan.concreate;

import com.iba.project.entity.plan.abstraction.classes.AbstractPlan;
import com.iba.project.entity.plan.abstraction.interfaces.PlanWithInternetInterface;

public class PlanWithInternet extends AbstractPlan implements PlanWithInternetInterface
{
    private int priceOfInternet;


    public PlanWithInternet(String cellularName, String name, int price) {
        super(cellularName, name, price);

    }

    public PlanWithInternet(PlanWithInternet planWithInternet) {
        super(planWithInternet.getCellularName(), planWithInternet.getName(), planWithInternet.getPrice());

        this.priceOfInternet=planWithInternet.getPriceOfInternet();
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
    public String toString() {
        String result = super.toString()+"\nprice Of internet: "+this.priceOfInternet;

        return result;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof PlanWithInternet)) return false;
        if (!super.equals(o)) return false;

        PlanWithInternet that = (PlanWithInternet) o;

        return getPriceOfInternet() == that.getPriceOfInternet();
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + getPriceOfInternet();
        return result;
    }
}
