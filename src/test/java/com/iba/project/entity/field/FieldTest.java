package com.iba.project.entity.field;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class FieldTest {
    Field firstField=null;
    Field secondField=null;
    Field thirdField=null;

    @BeforeMethod
    public void setUp() {
        firstField=new Field(1,2);
        secondField=new Field(firstField);
        thirdField=new Field(3,4);
    }

    @AfterMethod
    public void tearDown() {
        firstField=null;
        secondField=null;
        thirdField=null;
    }

    @Test
    public void testGetCalls() {
        assertEquals(1,firstField.getCalls());
        assertEquals(1,secondField.getCalls());
        assertEquals(3,thirdField.getCalls());
    }

    @Test
    public void testGetInternet() {
        assertEquals(2,firstField.getInternet());
        assertEquals(2,secondField.getInternet());
        assertEquals(4,thirdField.getInternet());
    }

    @Test
    public void testToString(){
        assertEquals("calls: 1 internet: 2",firstField.toString());
        assertEquals("calls: 1 internet: 2",secondField.toString());
        assertEquals("calls: 3 internet: 4",thirdField.toString());
    }

    @Test
    public void testEquals(){
        assertEquals(true,firstField.equals(firstField));
        assertEquals(true,firstField.equals(secondField));
        assertEquals(false,firstField.equals(thirdField));
    }

}