package com.iba.project.entity.plan.abstraction.classes;

import com.iba.project.entity.plan.abstraction.interfaces.PlanInterface;
import com.iba.project.loggin.exceptions.LoggerForExceptions;

import java.math.BigDecimal;
import java.math.RoundingMode;


public abstract class AbstractPlan implements PlanInterface {


    private String cellularName;
    private String name;
    private BigDecimal price;


    public AbstractPlan(String cellularName, String name, BigDecimal price) {
        price.setScale(2, RoundingMode.UP);

        this.cellularName = cellularName;
        this.name = name;
        this.price = price;
    }

    @Override
    public String getCellularName() {
        return cellularName;
    }

    @Override
    public BigDecimal getPrice() {
        return price;
    }

    @Override
    public String getName() {
        return name;
    }


    @Override
    public void setPrice(BigDecimal price) {
        try {
            if(price.intValue()<0) throw new IllegalArgumentException("price should be grater then zero");
            price.setScale(2,RoundingMode.UP);
            this.price = price;
        }
        catch (IllegalArgumentException exception)
        {
            this.price=new BigDecimal(0);
            LoggerForExceptions.notCorrectNumbersException(exception);
        }

    }

    @Override
    public void setCellularName(String cellularName) {
        this.cellularName = cellularName;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }


    @Override
    public String toString() {
        return "Cellular Name: " + this.cellularName + "\nName: " + this.name + "\nPrice: " + this.price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof AbstractPlan)) return false;

        AbstractPlan that = (AbstractPlan) o;

        if (!cellularName.equals(that.cellularName)) return false;
        if (!name.equals(that.name)) return false;
        return price.equals(that.price);
    }

    @Override
    public int hashCode() {
        int result = cellularName.hashCode();
        result = 31 * result + name.hashCode();
        result = 31 * result + price.hashCode();
        return result;
    }
}
