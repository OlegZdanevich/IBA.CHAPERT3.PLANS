package com.iba.project.entity.plan.concreate;

import com.iba.project.entity.plan.abstraction.classes.AbstractPlan;
import com.iba.project.entity.plan.abstraction.interfaces.PlanWithInternetInterface;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class PlanWithInternet extends AbstractPlan implements PlanWithInternetInterface
{
    private BigDecimal priceOfInternet;


    public PlanWithInternet(String cellularName, String name, BigDecimal price) {
        super(cellularName, name, price);

    }

    public PlanWithInternet(PlanWithInternet planWithInternet) {
        super(planWithInternet.getCellularName(), planWithInternet.getName(), planWithInternet.getPrice());

        this.priceOfInternet=planWithInternet.getPriceOfInternet();
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
    public void setPriceOfInternet(BigDecimal priceOfInternet) {

        priceOfInternet.setScale(2, RoundingMode.UP);
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

        return priceOfInternet.equals(that.priceOfInternet);
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + priceOfInternet.hashCode();
        return result;
    }
}
