package com.iba.project.entity.plan.abstraction.interfaces;

public interface InterfacePlan {
    public int getPrice();

    public String getName();


    public void setPrice(int price);

    public void setName(String name);


    public String toString();

    public int hashCode();

    public boolean equals(Object o);
}
