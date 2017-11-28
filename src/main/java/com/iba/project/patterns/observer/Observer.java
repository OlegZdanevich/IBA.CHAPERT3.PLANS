package com.iba.project.patterns.observer;


import com.iba.project.entity.plan.abstraction.classes.AbstractPlan;

public interface Observer<K extends AbstractPlan>
{
    void update(K oldPlan, K newPlan);
}
