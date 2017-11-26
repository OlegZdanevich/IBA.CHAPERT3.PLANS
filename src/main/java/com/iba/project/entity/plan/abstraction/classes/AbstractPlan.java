package com.iba.project.entity.plan.abstraction.classes;

import com.iba.project.entity.plan.abstraction.interfaces.InterfacePlan;

public abstract class AbstractPlan implements InterfacePlan {

    private String name;
    private int price;
    private long numberOfUsers;

    public AbstractPlan(String name, int price, long numberOfUsers)
    {
        this.name=name;
        this.price=price;
        this.numberOfUsers=numberOfUsers;
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
    public long getNumberOfUsers() {
        return numberOfUsers;
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
    public void setNumberOfUsers(long numberOfUsers) {
        this.numberOfUsers = numberOfUsers;
    }

    @Override
    public String toString() {
        return "Name: "+this.name+"\nPrice: "+this.price+"\n";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof AbstractPlan)) return false;

        AbstractPlan that = (AbstractPlan) o;

        if (getPrice() != that.getPrice()) return false;
        if (getNumberOfUsers() != that.getNumberOfUsers()) return false;
        return getName().equals(that.getName());
    }

    @Override
    public int hashCode() {
        int result = getName().hashCode();
        result = 31 * result + getPrice();
        result = 31 * result + (int) (getNumberOfUsers() ^ (getNumberOfUsers() >>> 32));
        return result;
    }
}
