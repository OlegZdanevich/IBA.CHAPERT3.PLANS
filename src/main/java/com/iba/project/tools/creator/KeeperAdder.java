package com.iba.project.tools.creator;

import com.iba.project.entity.plan.abstraction.classes.AbstractPlan;
import com.iba.project.keeper.plans.PlansKeeper;

public class KeeperAdder
{
    public static<K extends AbstractPlan> void addToKeeper(K plan,long numberOfUsers)
    {
        PlansKeeper keeper=PlansKeeper.getInstance();

        keeper.setPlan(plan,numberOfUsers);
    }
}
