package com.iba.project.entity.plan.abstraction.classes;

import com.iba.project.entity.plan.abstraction.interfaces.PlanInterface;


public abstract class AbstractPlan implements PlanInterface {


    private String cellularName;
    private String name;
    private int price;


    public AbstractPlan(String cellularName, String name, int price) {
        this.cellularName=cellularName;
        this.name = name;
        this.price = price;
    }

    @Override
    public String getCellularName() {
        return cellularName;
    }

    @Override
    public int getPrice() {
        return price;
    }

    @Override
    public String getName() {
        return name;
    }


    @Override
    public void setPrice(int price) {
        this.price = price;
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
        return "Cellular Name: "+this.cellularName+ "\nName: " + this.name + "\nPrice: " + this.price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof AbstractPlan)) return false;

        AbstractPlan that = (AbstractPlan) o;

        if (getPrice() != that.getPrice()) return false;
        if (!getCellularName().equals(that.getCellularName())) return false;
        return getName().equals(that.getName());
    }

    @Override
    public int hashCode() {
        int result = getCellularName().hashCode();
        result = 31 * result + getName().hashCode();
        result = 31 * result + getPrice();
        return result;
    }
}
