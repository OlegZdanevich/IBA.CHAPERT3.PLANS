package com.iba.project.entity.plan.abstraction.interfaces;

public interface InterfacePlan
{
    public int getPrice();

    public String getName();

    public long getNumberOfUsers();

    public void setPrice(int price);

    public void setName(String name);

    public void setNumberOfUsers(long number);

    public String toString();

    public int hashCode();

    public boolean equals(Object o);
}
