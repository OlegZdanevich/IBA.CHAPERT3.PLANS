package com.iba.project.entity.plan.concreate;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.math.BigDecimal;

import static org.junit.Assert.*;

public class PlanWithInternetTest {
    PlanWithInternet firstPlanWithInternet =null;
    PlanWithInternet secondPlanWithInternet =null;

    @Before
    public void setUp() {
        firstPlanWithInternet =new PlanWithInternet("MTS","Plan1",new BigDecimal(10));
        firstPlanWithInternet.setPriceOfInternet(new BigDecimal(20));

        secondPlanWithInternet =new PlanWithInternet("VELCOME","Plan2",new BigDecimal(20));
        secondPlanWithInternet.setPriceOfInternet(new BigDecimal(10));
    }

    @After
    public void tearDown() {
        firstPlanWithInternet =null;
        secondPlanWithInternet =null;
    }

    @Test
    public void getPrice() {
        assertEquals(new BigDecimal(10), firstPlanWithInternet.getPrice());
        assertEquals(new BigDecimal(20), secondPlanWithInternet.getPrice());
    }

    @Test
    public void getName(){
        assertEquals("Plan1", firstPlanWithInternet.getName());
        assertEquals("Plan2", secondPlanWithInternet.getName());
    }




    @Test
    public void getPriceToInternet() {
        assertEquals(new BigDecimal(20), firstPlanWithInternet.getPriceOfInternet());
        assertEquals(new BigDecimal(10), secondPlanWithInternet.getPriceOfInternet());
    }


    @Test
    public void equals() {
        assertEquals(false, firstPlanWithInternet.equals(secondPlanWithInternet));
        assertEquals(true, firstPlanWithInternet.equals(firstPlanWithInternet));
    }

    @Test
    public void toStringCheck() {
        assertEquals("Cellular Name: MTS\nName: Plan1\nPrice: 10\nprice Of internet: 20", firstPlanWithInternet.toString());
        assertEquals("Cellular Name: VELCOME\nName: Plan2\nPrice: 20\nprice Of internet: 10", secondPlanWithInternet.toString());
    }


}