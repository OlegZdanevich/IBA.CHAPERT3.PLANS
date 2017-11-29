package com.iba.project.entity.plan.concreate;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.math.BigDecimal;

import static org.junit.Assert.*;

public class PlanWithCallsAndInternetTest {
    PlanWithCallsAndInternet firstPlanWithCalls =null;
    PlanWithCallsAndInternet secondPlanWithCalls =null;

    @Before
    public void setUp() {
        firstPlanWithCalls =new PlanWithCallsAndInternet("MTS","Plan1",new BigDecimal(10));
        firstPlanWithCalls.setPriceOfInternet(new BigDecimal(40));
        firstPlanWithCalls.setPriceOfCalls(new BigDecimal(20));

        secondPlanWithCalls =new PlanWithCallsAndInternet("VELCOME","Plan2",new BigDecimal(20));
        secondPlanWithCalls.setPriceOfInternet(new BigDecimal(30));
        secondPlanWithCalls.setPriceOfCalls(new BigDecimal(10));
    }

    @After
    public void tearDown() {
        firstPlanWithCalls =null;
        secondPlanWithCalls =null;
    }

    @Test
    public void getPrice() {
        assertEquals(new BigDecimal(10), firstPlanWithCalls.getPrice());
        assertEquals(new BigDecimal(20), secondPlanWithCalls.getPrice());
    }

    @Test
    public void getName(){
        assertEquals("Plan1", firstPlanWithCalls.getName());
        assertEquals("Plan2", secondPlanWithCalls.getName());
    }




    @Test
    public void getPriceToCalls() {
        assertEquals(new BigDecimal(20), firstPlanWithCalls.getPriceOfCalls());
        assertEquals(new BigDecimal(10), secondPlanWithCalls.getPriceOfCalls());
    }

    @Test
    public void getPriceToInterenet() {
        assertEquals(new BigDecimal(40), firstPlanWithCalls.getPriceOfInternet());
        assertEquals(new BigDecimal(30), secondPlanWithCalls.getPriceOfInternet());
    }


    @Test
    public void equals() {
        assertEquals(false, firstPlanWithCalls.equals(secondPlanWithCalls));
        assertEquals(true, firstPlanWithCalls.equals(firstPlanWithCalls));
    }

    @Test
    public void toStringCheck() {
        assertEquals("Cellular Name: MTS\nName: Plan1\nPrice: 10\nprice Of calls: 20\nprice Of internet: 40", firstPlanWithCalls.toString());
        assertEquals("Cellular Name: VELCOME\nName: Plan2\nPrice: 20\nprice Of calls: 10\nprice Of internet: 30", secondPlanWithCalls.toString());
    }

}