package com.iba.project.entity.plan.concreate;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PlanTest {
    Plan firstPlan=null;
    Plan secondPlan=null;

    @Before
    public void setUp() {
        firstPlan=new Plan("Plan1",10);
        firstPlan.setPriceToCallsAndInternet(20,40);
        firstPlan.setFreeMinutesAndInternet(1000,100);

        secondPlan=new Plan("Plan2",20);
        secondPlan.setPriceToCallsAndInternet(10,15);
    }

    @After
    public void tearDown() {
        firstPlan=null;
        secondPlan=null;
    }

    @Test
    public void getPrice() {
        assertEquals(10,firstPlan.getPrice());
        assertEquals(20,secondPlan.getPrice());
    }

    @Test
    public void getName(){
        assertEquals("Plan1",firstPlan.getName());
        assertEquals("Plan2",secondPlan.getName());
    }


    @Test
    public void getFreeMinutes() {
        assertEquals(1000,firstPlan.getFreeMinutes());
        assertEquals(0,secondPlan.getFreeMinutes());
    }

    @Test
    public void getFreeInternet()
    {
        assertEquals(100,firstPlan.getFreeInternet());
        assertEquals(0,secondPlan.getFreeInternet());
    }

    @Test
    public void getPriceToCalls() {
        assertEquals(20,firstPlan.getPriceToCalls());
        assertEquals(10,secondPlan.getPriceToCalls());
    }

    @Test
    public void getPriceToInternet() {
        assertEquals(40,firstPlan.getPriceToInternet());
        assertEquals(15,secondPlan.getPriceToInternet());
    }

    @Test
    public void equals() {
        assertEquals(false,firstPlan.equals(secondPlan));
        assertEquals(true,firstPlan.equals(firstPlan));
    }

    @Test
    public void toStringCheck() {
        assertEquals("Name: Plan1\nPrice: 10\nPrices(min,mb): calls: 20 internet: 40\nFree (min,mb): calls: 1000 internet: 100\n",firstPlan.toString());
        assertEquals("Name: Plan2\nPrice: 20\nPrices(min,mb): calls: 10 internet: 15\n",secondPlan.toString());
    }

}