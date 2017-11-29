package com.iba.project.entity.plan.abstraction.interfaces;

import java.math.BigDecimal;

public interface PlanWithCallsInterface
{
    BigDecimal getPriceOfCalls();
    void setPriceOfCalls(BigDecimal priceOfCalls);
}
