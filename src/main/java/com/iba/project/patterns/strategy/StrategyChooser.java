package com.iba.project.patterns.strategy;

import com.iba.project.entity.plan.abstraction.classes.AbstractPlan;
import com.iba.project.patterns.strategy.concreate.PlanWithCallsAndInternetCreater;
import com.iba.project.patterns.strategy.concreate.PlanWithCallsCreater;
import com.iba.project.patterns.strategy.concreate.PlanWithInternetCreater;

public class StrategyChooser {
    public static AbstractPlan createPlan(String[] data) {
        StrategyPlanManager manager = new StrategyPlanManager();

        if (!data[3].equals("0") && !data[4].equals("0")) {
            manager.setStrategy(new PlanWithCallsAndInternetCreater());
        } else {
            if (!data[4].equals("0")) {
                manager.setStrategy(new PlanWithInternetCreater());
            } else {
                manager.setStrategy(new PlanWithCallsCreater());
            }
        }

        AbstractPlan planToAdd = manager.executeStrategy(data);

        return planToAdd;
    }
}
