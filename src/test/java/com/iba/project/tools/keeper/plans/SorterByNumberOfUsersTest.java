package com.iba.project.tools.keeper.plans;

import com.iba.project.entity.plan.concreate.Plan;
import com.iba.project.keeper.plans.PlansKeeper;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;
import java.util.LinkedHashMap;

import static org.junit.Assert.*;

public class SorterByNumberOfUsersTest {
    PlansKeeper keeper=null;

    Plan firstPlan=null;
    Plan secondPlan=null;
    Plan thirdPlan=null;

    @Before
    public void setUp()
    {
        keeper=PlansKeeper.getInstance();

        firstPlan=new Plan("Plan1",1060);
        firstPlan.setPriceToCallsAndInternet(20,40);
        firstPlan.setFreeMinutesAndInternet(1000,100);

        secondPlan=new Plan("Plan2",200);
        secondPlan.setPriceToCallsAndInternet(10,15);

        thirdPlan=new Plan("Plan3",1000);


        keeper.setPlan(firstPlan,1000);
        keeper.setPlan(secondPlan,20000);
        keeper.setPlan(thirdPlan,1000000);
    }

    @After
    public void tearDown(){
        keeper=null;

        firstPlan=null;
        secondPlan=null;
        thirdPlan=null;

    }

    @Test
    public void sort()
    {
        LinkedHashMap result=new LinkedHashMap();
        result.put(secondPlan,20000L);
        result.put(thirdPlan,1000000L);
        result.put(firstPlan,1000L);

        assertEquals(result.keySet().toArray(),SorterByNumberOfUsers.sort(keeper).keySet().toArray());
        assertEquals(result.values().toArray(),SorterByNumberOfUsers.sort(keeper).values().toArray());
    }

}