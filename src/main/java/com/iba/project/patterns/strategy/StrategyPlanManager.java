package com.iba.project.patterns.strategy;

import com.iba.project.entity.plan.abstraction.classes.AbstractPlan;
import com.iba.project.patterns.strategy.interfaces.Strategy;

public class StrategyPlanManager{
    private Strategy strategy;


    public StrategyPlanManager() {
    }


    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }

    public AbstractPlan executeStrategy(String[] data) {
        return strategy.createPlan(data);
    }
}
