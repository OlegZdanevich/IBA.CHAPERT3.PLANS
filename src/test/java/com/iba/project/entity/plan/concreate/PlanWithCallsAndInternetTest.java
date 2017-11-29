package com.iba.project.entity.plan.concreate;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PlanWithCallsAndInternetTest {
    PlanWithCallsAndInternet firstPlanWithCalls =null;
    PlanWithCallsAndInternet secondPlanWithCalls =null;

    @Before
    public void setUp() {
        firstPlanWithCalls =new PlanWithCallsAndInternet("MTS","Plan1",10);
        firstPlanWithCalls.setPriceOfInternet(40);
        firstPlanWithCalls.setPriceOfCalls(20);

        secondPlanWithCalls =new PlanWithCallsAndInternet("VELCOME","Plan2",20);
        secondPlanWithCalls.setPriceOfInternet(30);
        secondPlanWithCalls.setPriceOfCalls(10);
    }

    @After
    public void tearDown() {
        firstPlanWithCalls =null;
        secondPlanWithCalls =null;
    }

    @Test
    public void getPrice() {
        assertEquals(10, firstPlanWithCalls.getPrice());
        assertEquals(20, secondPlanWithCalls.getPrice());
    }

    @Test
    public void getName(){
        assertEquals("Plan1", firstPlanWithCalls.getName());
        assertEquals("Plan2", secondPlanWithCalls.getName());
    }




    @Test
    public void getPriceToCalls() {
        assertEquals(20, firstPlanWithCalls.getPriceOfCalls());
        assertEquals(10, secondPlanWithCalls.getPriceOfCalls());
    }

    @Test
    public void getPriceToInterenet() {
        assertEquals(40, firstPlanWithCalls.getPriceOfInternet());
        assertEquals(30, secondPlanWithCalls.getPriceOfInternet());
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