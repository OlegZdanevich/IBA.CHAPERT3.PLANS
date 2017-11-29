package com.iba.project.tools.keeper.plans;

import com.iba.project.entity.plan.concreate.PlanWithCalls;
import com.iba.project.entity.plan.concreate.PlanWithCallsAndInternet;
import com.iba.project.entity.plan.concreate.PlanWithInternet;
import com.iba.project.keeper.plans.PlansKeeper;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.LinkedHashMap;
import java.util.LinkedHashSet;

import static org.junit.Assert.*;

public class SorterByPriceTest {
    PlansKeeper keeper=null;

    PlanWithCalls planWithCalls =null;
    PlanWithInternet planWithInternet =null;
    PlanWithCallsAndInternet planWithCallsAndInternet =null;

    @Before
    public void setUp()
    {
        keeper=PlansKeeper.getInstance();

        planWithCalls =new PlanWithCalls("MTS","Plan1",20);
        planWithCalls.setPriceOfCalls(20);

        planWithInternet =new PlanWithInternet("Velcom","Plan2",10);
        planWithInternet.setPriceOfInternet(10);

        planWithCallsAndInternet =new PlanWithCallsAndInternet("Life","Plan3",1060);
        planWithCallsAndInternet.setPriceOfInternet(10);
        planWithCallsAndInternet.setPriceOfCalls(20);


        keeper.setPlan(planWithCalls,1000);
        keeper.setPlan(planWithInternet,20000);
        keeper.setPlan(planWithCallsAndInternet,3500);
    }

    @After
    public void tearDown(){
        keeper=null;

        planWithCalls =null;
        planWithInternet =null;
        planWithCallsAndInternet =null;

    }

    @Test
    public void sort()
    {
        LinkedHashMap order=new LinkedHashMap();
        order.put(planWithInternet,20000L);
        order.put(planWithCalls,1000L);
        order.put(planWithCallsAndInternet,3500L);

        LinkedHashSet orderKeys=new LinkedHashSet(order.keySet());

        LinkedHashSet orderValues=new LinkedHashSet(order.values());

        assertEquals(orderKeys,new LinkedHashSet(SorterByPrice.sort(keeper).keySet()));
        assertEquals(orderValues,new LinkedHashSet(SorterByPrice.sort(keeper).values()));
    }

}