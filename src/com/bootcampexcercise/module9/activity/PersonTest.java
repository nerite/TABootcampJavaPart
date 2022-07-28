package com.bootcampexcercise.module9.activity;

import junit.framework.TestCase;

public class PersonTest extends TestCase {

    private Person person;

    //TODO: create set up
    protected void setUp() throws Exception{
        super.setUp();
        person = new Person();
    }
    //TODO: create teardown
    protected void tearDown() throws Exception{
     person = null;
     super.tearDown();
    }
    //TODO: create unit tests for getters and setters
    public void testSetAndGetWeight(){
        int weight = 55; // kilograms
        assertEquals(0, person.getWeight());
        person.setWeight(weight);
        assertEquals(weight, person.getWeight());
    }

    public void testSetAndGetHeight(){
        float height = 1.5f; // meters
        assertEquals(0.0f, person.getHeight());
        person.setHeight(height);
        assertEquals(height, person.getHeight());
    }

    //TODO: create unit test for getBodyMassIndex method
    public void testBodyMassIndex(){
        int weight = 55;
        float height = 1.5f;
        double ans = weight/(height*height);
        assertEquals(ans, person.getBodyMassIndex(weight,height));

        int weight1 = -55;
        float height1 = -1.5f;
        assertEquals(0.0, person.getBodyMassIndex(weight1,height1));

        int weight2 = 350;
        float height2 = 5.5f;
        assertEquals(0.0, person.getBodyMassIndex(weight2,height2));
    }
}
