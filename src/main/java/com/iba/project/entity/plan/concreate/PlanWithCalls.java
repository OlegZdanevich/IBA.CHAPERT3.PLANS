package com.iba.project.entity.plan.concreate;

import com.iba.project.entity.plan.abstraction.classes.AbstractPlan;
import com.iba.project.entity.plan.abstraction.interfaces.PlanWithCallsInterface;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class PlanWithCalls extends AbstractPlan implements PlanWithCallsInterface {

    private BigDecimal priceOfCalls;


    public PlanWithCalls(String cellularName, String name, BigDecimal price) {
        super(cellularName, name, price);
    }

    public PlanWithCalls(PlanWithCalls planWithCalls) {
        super(planWithCalls.getCellularName(), planWithCalls.getName(), planWithCalls.getPrice());

        this.priceOfCalls=planWithCalls.priceOfCalls;
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
    public String getCellularName() {
        return super.getCellularName();
    }


    @Override
    public void setCellularName(String cellularName) {
        super.setCellularName(cellularName);
    }

    @Override
    public void setPriceOfCalls(BigDecimal priceOfCalls) {
        priceOfCalls.setScale(2,RoundingMode.UP);
        this.priceOfCalls = priceOfCalls;
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

        return priceOfCalls.equals(that.priceOfCalls);
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + priceOfCalls.hashCode();
        return result;
    }
}
