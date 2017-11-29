package com.iba.project.patterns.strategy.concreate;

import com.iba.project.entity.plan.concreate.PlanWithCallsAndInternet;
import com.iba.project.patterns.strategy.interfaces.Strategy;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class PlanWithCallsAndInternetCreater implements Strategy {
    @Override
    public PlanWithCallsAndInternet createPlan(String[] data) {
        String cellularName = data[0];
        String planName = data[1];
        BigDecimal price = new BigDecimal(data[2]);
        BigDecimal priceOfCalls = new BigDecimal(data[3]);
        BigDecimal priceOfInernet = new BigDecimal(data[4]);

        price.setScale(2, RoundingMode.UP);
        priceOfCalls.setScale(2, RoundingMode.UP);
        priceOfInernet.setScale(2, RoundingMode.UP);

        PlanWithCallsAndInternet plan = new PlanWithCallsAndInternet(cellularName, planName, price);
        plan.setPriceOfCalls(priceOfCalls);
        plan.setPriceOfInternet(priceOfInernet);

        return plan;
    }
}
