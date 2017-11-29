package com.iba.project.keeper.plans;

import com.iba.project.entity.plan.concreate.PlanWithCalls;
import com.iba.project.entity.plan.concreate.PlanWithCallsAndInternet;
import com.iba.project.entity.plan.concreate.PlanWithInternet;
import com.iba.project.loggin.results.Info;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;

public class PlansKeeperTest {

    PlansKeeper keeper=null;

    PlanWithCalls planWithCalls =null;
    PlanWithInternet planWithInternet =null;
    PlanWithCallsAndInternet planWithCallsAndInternet =null;


    @Before
    public void setUp() {
        keeper=PlansKeeper.getInstance();

        planWithCalls =new PlanWithCalls("MTS","Plan1",10);
        planWithCalls.setPriceOfCalls(20);

        planWithInternet =new PlanWithInternet("Velcom","Plan2",20);
        planWithInternet.setPriceOfInternet(10);

        planWithCallsAndInternet =new PlanWithCallsAndInternet("Life","Plan3",1060);
        planWithCallsAndInternet.setPriceOfInternet(10);
        planWithCallsAndInternet.setPriceOfCalls(20);


        keeper.setPlan(planWithCalls,1000);
        keeper.setPlan(planWithInternet,20000);
        keeper.setPlan(planWithCallsAndInternet,3500);

    }

    @After
    public void tearDown()  {
        keeper=null;

        planWithCalls =null;
        planWithInternet =null;
        planWithCallsAndInternet =null;

    }



    @Test
    public void viewKeeperData()
    {
        Info.writeInfo(keeper.toString());
    }

}