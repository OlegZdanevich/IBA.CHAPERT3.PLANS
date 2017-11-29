package com.iba.project.tools.entity.plan.comparators;

import com.iba.project.entity.plan.abstraction.classes.AbstractPlan;

import java.util.Comparator;

public class ComparatorByPrice <K extends AbstractPlan> implements Comparator<K> {
    public int compare(K firstElement, K secondElement) {
        int result = (firstElement.getPrice().compareTo(secondElement.getPrice())>0 ) ? 1 : -1;
        return result;

    }
}
