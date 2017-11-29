package com.iba.project.patterns.strategy.concreate;

import com.iba.project.entity.plan.concreate.PlanWithInternet;
import com.iba.project.patterns.strategy.interfaces.Strategy;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class PlanWithInternetCreater implements Strategy {
    @Override
    public PlanWithInternet createPlan(String[] data) {
        String cellularName = data[0];
        String planName = data[1];
        BigDecimal price = new BigDecimal(data[2]);
        BigDecimal priceOfInernet = new BigDecimal(data[4]);

        price.setScale(2, RoundingMode.UP);
        priceOfInernet.setScale(2, RoundingMode.UP);

        PlanWithInternet plan = new PlanWithInternet(cellularName, planName, price);
        plan.setPriceOfInternet(priceOfInernet);

        return plan;
    }
}
