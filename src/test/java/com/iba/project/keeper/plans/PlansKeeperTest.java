package com.iba.project.keeper.plans;

import com.iba.project.entity.plan.concreate.Plan;
import com.iba.project.loggin.results.Info;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;
import java.util.HashSet;

import static org.junit.Assert.*;

public class PlansKeeperTest {

    PlansKeeper keeper=null;

    Plan firstPlan=null;
    Plan secondPlan=null;
    Plan thirdPlan=null;

    HashMap plans=null;

    @Before
    public void setUp() {
        keeper=PlansKeeper.getInstance();

        firstPlan=new Plan("Plan1",10);
        firstPlan.setPriceToCallsAndInternet(20,40);
        firstPlan.setFreeMinutesAndInternet(1000,100);

        secondPlan=new Plan("Plan2",20);
        secondPlan.setPriceToCallsAndInternet(10,15);

        thirdPlan=new Plan("Plan3",1060);

        plans=new HashMap();
        plans.put(firstPlan,1000);
        plans.put(secondPlan,20000);

        keeper.setPlan(firstPlan,1000);
        keeper.setPlan(secondPlan,20000);

    }

    @After
    public void tearDown()  {
        keeper=null;

        firstPlan=null;
        secondPlan=null;
        thirdPlan=null;

        plans=null;
    }

    @Test
    public void update()
    {
        firstPlan.setPrice(12);
    }

    @Test
    public void setPlan()
    {
        keeper.setPlan(thirdPlan,3500);
        Info.writeInfo(keeper.toString());
    }

}