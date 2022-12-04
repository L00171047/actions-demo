package com.company;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test for Addition :-) 
     */
    @Test
    public void checkAdditionTest1()
    {
        assertEquals(5, App.addTwoNumbers(2, 3));
    }

    @Test
    public void checkAdditionTest2()
    {
        assertEquals(5, App.addTwoNumbers(3, 3));
    }
}
