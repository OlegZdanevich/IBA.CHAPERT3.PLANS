package com.iba.project.tools.keeper.plans;

import com.iba.project.entity.plan.abstraction.classes.AbstractPlan;
import com.iba.project.keeper.plans.PlansKeeper;
import com.iba.project.tools.entity.plan.comparators.ComparatorByPrice;

import java.util.LinkedHashMap;
import java.util.TreeMap;

public class SorterByNumberOfUsers {
    public static <K extends AbstractPlan> LinkedHashMap<K, Long> sort(PlansKeeper keeper) {


        TreeMap<K, Long> sortedPlans = new TreeMap(new ComparatorByPrice());

        sortedPlans.putAll(keeper.getPlansMap());

        LinkedHashMap<K, Long> sortedMap = new LinkedHashMap<>(sortedPlans);

        return sortedMap;
    }
}
