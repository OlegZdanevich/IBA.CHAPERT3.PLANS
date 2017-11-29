package com.iba.project.tools.keeper.plans;

import com.iba.project.entity.plan.abstraction.classes.AbstractPlan;
import com.iba.project.keeper.plans.PlansKeeper;

import java.util.HashMap;

public class CounterByNumberOfUsers {
    public static <K extends AbstractPlan> long count(PlansKeeper keeper) {
        HashMap<K, Long> data = keeper.getPlansMap();

        long wholeNumberOfUsers = 0;

        for (long numberOfUsers : data.values()) {
            wholeNumberOfUsers += numberOfUsers;
        }

        return wholeNumberOfUsers;
    }
}
