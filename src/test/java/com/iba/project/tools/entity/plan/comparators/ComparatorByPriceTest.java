package com.iba.project.tools.entity.plan.comparators;

import com.iba.project.entity.plan.concreate.PlanWithCalls;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.math.BigDecimal;

import static org.junit.Assert.*;

public class ComparatorByPriceTest {
    private PlanWithCalls firstPlanWithCalls =null;
    private PlanWithCalls secondPlanWithCalls =null;
    private ComparatorByPrice comparator=null;

    @Before
    public void setUp() {
        firstPlanWithCalls =new PlanWithCalls("MTS","Plan1",new BigDecimal(10));
        secondPlanWithCalls =new PlanWithCalls("Velcome","Plan2",new BigDecimal(100));


        comparator=new ComparatorByPrice();
    }

    @After
    public void tearDown(){
        firstPlanWithCalls =null;
        secondPlanWithCalls =null;

        comparator=null;
    }

    @Test
    public void compare(){
        assertEquals(-1,comparator.compare(firstPlanWithCalls, secondPlanWithCalls));
        assertEquals(1,comparator.compare(secondPlanWithCalls, firstPlanWithCalls));
    }

}