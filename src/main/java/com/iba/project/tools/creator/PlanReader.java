package com.iba.project.tools.creator;

import com.iba.project.entity.plan.abstraction.classes.AbstractPlan;
import com.iba.project.entity.plan.concreate.PlanWithCalls;
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
            StrategyPlanManager manager=new StrategyPlanManager();

            if(!arrayOfData[3].equals("0") && !arrayOfData[4].equals("0"))
            {
                manager.setStrategy(new PlanWithCallsAndInternetCreater());
            }
            else
            {
                if(!arrayOfData[4].equals("0"))
                {
                    manager.setStrategy(new PlanWithInternetCreater());
                }
                else
                {
                    manager.setStrategy(new PlanWithCallsCreater());
                }
            }

            AbstractPlan planToAdd=manager.executeStrategy(arrayOfData);

            long numberOfUsers=(Validator.isNumberOfUsersValid(arrayOfData))? Long.parseLong(arrayOfData[5]):0L;

            KeeperAdder.addToKeeper(planToAdd,numberOfUsers);


        }

    }
}
