package com.iba.project.patterns.strategy.concreate;

import com.iba.project.entity.plan.concreate.PlanWithCalls;
import com.iba.project.patterns.strategy.interfaces.Strategy;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class PlanWithCallsCreater implements Strategy{
    @Override
    public PlanWithCalls createPlan(String[] data)
    {
        String cellularName=data[0];
        String planName=data[1];
        BigDecimal price=new BigDecimal(data[2]);
        BigDecimal priceOfCalls=new BigDecimal(data[3]);


        price.setScale(2, RoundingMode.UP);
        priceOfCalls.setScale(2, RoundingMode.UP);


        PlanWithCalls plan=new PlanWithCalls(cellularName,planName,price);
        plan.setPriceOfCalls(priceOfCalls);


        return plan;
    }
}
