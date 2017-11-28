package com.iba.project.entity.plan.abstraction.classes;

import com.iba.project.entity.plan.abstraction.interfaces.InterfacePlan;
import com.iba.project.patterns.observer.Observable;

public abstract class AbstractPlan<K extends AbstractPlan> implements InterfacePlan, Observable<K> {

    private String name;
    private int price;


    public AbstractPlan(String name, int price) {
        this.name = name;
        this.price = price;
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
    public void setName(String name) {
        this.name = name;
    }


    @Override
    public String toString() {
        return "Name: " + this.name + "\nPrice: " + this.price + "\n";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof AbstractPlan)) return false;

        AbstractPlan<?> that = (AbstractPlan<?>) o;

        if (getPrice() != that.getPrice()) return false;
        return getName().equals(that.getName());
    }

    @Override
    public int hashCode() {
        int result = getName().hashCode();
        result = 31 * result + getPrice();
        return result;
    }
}
