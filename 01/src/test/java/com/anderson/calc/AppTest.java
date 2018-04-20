package com.anderson.calc;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class AppTest 
    extends TestCase
{
    public void testApp()
    {
        Addition addition = new Addition();
        int sum = addition.addNumbers(2, 2);
        assertEquals(4, sum);
    }
}
