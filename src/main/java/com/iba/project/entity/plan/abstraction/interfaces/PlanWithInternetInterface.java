package com.iba.project.entity.plan.abstraction.interfaces;

import java.math.BigDecimal;

public interface PlanWithInternetInterface
{
    BigDecimal getPriceOfInternet();
    void setPriceOfInternet(BigDecimal priceForInternet);
}
