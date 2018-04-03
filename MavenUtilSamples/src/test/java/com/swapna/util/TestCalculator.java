package com.swapna.util;

import junit.framework.TestCase;

public class TestCalculator extends TestCase
{
    Calculator cal = new Calculator();
    public void testMultiply()
    {
        
        assertTrue(cal.multiply(4, 3) == 12);
    }
    
    public void testAdd()
    {
        assertTrue(cal.add(2, 5) == 7);
    }
    public void testsubstract()
    {
        assertTrue(cal.substract(8, 5) == 3);
    }
}
