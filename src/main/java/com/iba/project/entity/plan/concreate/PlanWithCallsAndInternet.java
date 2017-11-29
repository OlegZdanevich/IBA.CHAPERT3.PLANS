package com.iba.project.entity.plan.concreate;

import com.iba.project.entity.plan.abstraction.classes.AbstractPlan;
import com.iba.project.entity.plan.abstraction.interfaces.PlanWithCallsInterface;
import com.iba.project.entity.plan.abstraction.interfaces.PlanWithInternetInterface;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class PlanWithCallsAndInternet extends AbstractPlan implements PlanWithInternetInterface,PlanWithCallsInterface{

    private BigDecimal priceOfCalls;
    private BigDecimal priceOfInternet;


    public PlanWithCallsAndInternet(String cellularName, String name, BigDecimal price) {
        super(cellularName, name, price);

    }


    public PlanWithCallsAndInternet(PlanWithCallsAndInternet planWithCallsAndInternet) {
        super(planWithCallsAndInternet.getCellularName(), planWithCallsAndInternet.getName(), planWithCallsAndInternet.getPrice());


        this.priceOfCalls=planWithCallsAndInternet.priceOfCalls;
        this.priceOfInternet=planWithCallsAndInternet.priceOfInternet;
    }

    @Override
    public BigDecimal getPrice() {
        return super.getPrice();
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public BigDecimal getPriceOfCalls() {
        return priceOfCalls;
    }

    @Override
    public BigDecimal getPriceOfInternet() {
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
    public void setPriceOfCalls(BigDecimal priceOfCalls) {
        priceOfCalls.setScale(2, RoundingMode.UP);

        this.priceOfCalls = priceOfCalls;
    }

    @Override
    public void setPriceOfInternet(BigDecimal priceOfInternet) {
        priceOfInternet.setScale(2,RoundingMode.UP);

        this.priceOfInternet = priceOfInternet;
    }

    @Override
    public void setPrice(BigDecimal price) {


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

        if (!priceOfCalls.equals(that.priceOfCalls)) return false;
        return priceOfInternet.equals(that.priceOfInternet);
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + priceOfCalls.hashCode();
        result = 31 * result + priceOfInternet.hashCode();
        return result;
    }

    @Override
    public String toString() {
        String result = super.toString()+"\nprice Of calls: "+this.priceOfCalls+"\nprice Of internet: "+this.priceOfInternet;

        return result;
    }

}
