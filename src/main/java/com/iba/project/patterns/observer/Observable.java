package com.iba.project.patterns.observer;


import com.iba.project.entity.plan.abstraction.classes.AbstractPlan;

public interface Observable<K extends AbstractPlan>
{
    void registerObserver(Observer o);
    void removeObserver(Observer o);
    void notifyObservers(K oldPlan, K newPlan);
}
