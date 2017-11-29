package com.iba.project.keeper.plans;

import com.iba.project.entity.plan.concreate.PlanWithCalls;
import com.iba.project.entity.plan.concreate.PlanWithCallsAndInternet;
import com.iba.project.entity.plan.concreate.PlanWithInternet;
import com.iba.project.loggin.results.Info;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.math.BigDecimal;
import java.util.HashMap;

public class PlansKeeperTest {

    private PlansKeeper keeper=null;

    private PlanWithCalls planWithCalls =null;
    private PlanWithInternet planWithInternet =null;
    private PlanWithCallsAndInternet planWithCallsAndInternet =null;


    @Before
    public void setUp() {
        keeper=PlansKeeper.getInstance();

        planWithCalls =new PlanWithCalls("MTS","Plan1",new BigDecimal(10));
        planWithCalls.setPriceOfCalls(new BigDecimal(20));

        planWithInternet =new PlanWithInternet("Velcom","Plan2",new BigDecimal(20));
        planWithInternet.setPriceOfInternet(new BigDecimal(10));

        planWithCallsAndInternet =new PlanWithCallsAndInternet("Life","Plan3",new BigDecimal(1060));
        planWithCallsAndInternet.setPriceOfInternet(new BigDecimal(10));
        planWithCallsAndInternet.setPriceOfCalls(new BigDecimal(20));


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