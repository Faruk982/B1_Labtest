package com.example.b1;

import junit.framework.TestCase;

import org.junit.Test;

public class RedTest extends TestCase {
    @Test
    public void testRedr(){
        Red red=new Red();
        assertEquals("The Color is Red",red.showColor());
    }

}