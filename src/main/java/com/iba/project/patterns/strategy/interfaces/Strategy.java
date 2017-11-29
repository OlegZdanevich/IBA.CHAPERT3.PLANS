package com.iba.project.patterns.strategy.interfaces;

import com.iba.project.entity.plan.abstraction.classes.AbstractPlan;

public interface Strategy <K extends AbstractPlan>
{
    K createPlan(String[] data);
}
