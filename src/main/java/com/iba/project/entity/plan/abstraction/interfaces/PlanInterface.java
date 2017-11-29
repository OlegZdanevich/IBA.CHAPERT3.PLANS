package com.iba.project.entity.plan.abstraction.interfaces;

import java.math.BigDecimal;

public interface PlanInterface {
    public String getCellularName();

    public BigDecimal getPrice();

    public String getName();

    public void setCellularName(String name);

    public void setPrice(BigDecimal price);

    public void setName(String name);


    public String toString();

    public int hashCode();

    public boolean equals(Object o);
}
