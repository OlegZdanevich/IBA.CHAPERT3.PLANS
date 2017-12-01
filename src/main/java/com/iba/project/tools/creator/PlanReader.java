package com.iba.project.tools.creator;

import com.iba.project.entity.plan.abstraction.classes.AbstractPlan;
import com.iba.project.entity.plan.concreate.PlanWithCalls;
import com.iba.project.patterns.strategy.StrategyChooser;
import com.iba.project.patterns.strategy.StrategyPlanManager;
import com.iba.project.patterns.strategy.concreate.PlanWithCallsAndInternetCreater;
import com.iba.project.patterns.strategy.concreate.PlanWithCallsCreater;
import com.iba.project.patterns.strategy.concreate.PlanWithInternetCreater;
import com.iba.project.tools.validator.Validator;

import java.math.BigDecimal;

public class PlanReader {
    public static void createPlan(String[] arrayOfData)
    {
        if(Validator.isDataValidForPlan(arrayOfData))
        {

            AbstractPlan planToAdd= StrategyChooser.createPlan(arrayOfData);

            long numberOfUsers=(Validator.isNumberOfUsersValid(arrayOfData))? Long.parseLong(arrayOfData[5]):0L;

            KeeperAdder.addToKeeper(planToAdd,numberOfUsers);


        }

    }
}
