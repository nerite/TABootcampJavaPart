package com.bootcampexcercise.module10;

import junit.framework.TestCase;

public class CalculatorTest extends TestCase {

    private Calculator myCalculator;

    protected void setUp() throws Exception{
        super.setUp();
        myCalculator = new Calculator();
    }

    protected void tearDown() throws Exception{
        myCalculator = null;
        super.tearDown();
    }

    public void testAdd(){

        int a = 2;
        int b = 8;
        assertEquals(10,(myCalculator.add(a,b)));
        assertEquals(10,(myCalculator.add(b,a)));

        a = -2;
        b = 8;
        assertEquals(6,(myCalculator.add(a,b)));
        assertEquals(6,(myCalculator.add(b,a)));

        a = -2;
        b = -8;
        assertEquals(-10,(myCalculator.add(a,b)));
        assertEquals(-10,(myCalculator.add(b,a)));

        double c = 2.5;
        double d = 7.5;
        assertEquals(10.0,(myCalculator.add(c,d)));
        assertEquals(10.0,(myCalculator.add(d,c)));

        c = -2.5;
        d = 7.5;
        assertEquals(5.0,(myCalculator.add(c,d)));
        assertEquals(5.0,(myCalculator.add(d,c)));

        c = -2.5;
        d = -7.5;
        assertEquals(-10.0,(myCalculator.add(c,d)));
        assertEquals(-10.0,(myCalculator.add(d,c)));

    }

    public void testSubtract(){

        int a = 10;
        int b = 5;
        assertEquals(5,(myCalculator.subtract(a,b)));
        assertEquals(-5,(myCalculator.subtract(b,a)));

        a = 10;
        b = -5;
        assertEquals(15,(myCalculator.subtract(a,b)));
        assertEquals(-15,(myCalculator.subtract(b,a)));

        a = -10;
        b = -5;
        assertEquals(-5,(myCalculator.subtract(a,b)));
        assertEquals(5,(myCalculator.subtract(b,a)));
    }

    public void testDivide(){

        double a = 10;
        double b = 2;
        assertEquals(5.0,(myCalculator.divide(a,b)));
        assertEquals(0.2,(myCalculator.divide(b,a)));

        a = 10;
        b = -2.0;
        assertEquals(-5.0,(myCalculator.divide(a,b)));
        assertEquals(-0.2,(myCalculator.divide(b,a)));

        a = 10;
        b = 0;
        assertEquals(0.0,(myCalculator.divide(a,b)));
        assertEquals(0.0,(myCalculator.divide(b,a)));

    }

    public void testMultiply() throws CustomException {

        int[] a = {1, 3, 5};
        assertEquals(15,(myCalculator.multiply(a)));

        int[] b = {2, 0, 5};
        assertEquals(0,(myCalculator.multiply(b)));
    }
}
