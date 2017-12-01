package com.iba.project.keeper.plans;

import com.iba.project.entity.plan.abstraction.classes.AbstractPlan;

import java.util.HashMap;
import java.util.Map;

public class PlansKeeper<K extends AbstractPlan> {
    HashMap<K, Long> plansMap = new HashMap<>();

    private static volatile PlansKeeper instance;

    public static PlansKeeper getInstance() {
        PlansKeeper localInstance = instance;
        if (localInstance == null) {
            synchronized (PlansKeeper.class) {
                localInstance = instance;
                if (localInstance == null) {
                    instance = localInstance = new PlansKeeper();
                }
            }
        }
        return localInstance;
    }


    public void setPlan(K newPlan, long numberOfUsers) {
        plansMap.put(newPlan, numberOfUsers);
    }

    public HashMap<K, Long> getPlansMap() {
        return plansMap;
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder("");
        for (Map.Entry entry : plansMap.entrySet()) {
            result.append("PlanWithCalls:\n" + entry.getKey() + "\nNumberOfUsers:\n" + entry.getValue() + "\n\n");
        }

        return result.toString();
    }

    private PlansKeeper()
    {

    }
}
