package com.iba.project.tools.entity.plan.comparators;

import com.iba.project.entity.plan.concreate.Plan;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ComparatorByPriceTest {
    Plan firstPlan=null;
    Plan secondPlan=null;
    ComparatorByPrice comparator=null;

    @Before
    public void setUp() {
        firstPlan=new Plan("Plan1",10);
        secondPlan=new Plan("Plan2",100);


        comparator=new ComparatorByPrice();
    }

    @After
    public void tearDown(){
        firstPlan=null;
        secondPlan=null;

        comparator=null;
    }

    @Test
    public void compare(){
        assertEquals(-1,comparator.compare(firstPlan,secondPlan));
        assertEquals(1,comparator.compare(secondPlan,firstPlan));
    }

}