package com.zlateva;

import org.junit.Before;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

public class UtilitiesTest {

    public Utilities utilities;
    @Before
    public void setup(){
        utilities = new Utilities();
    }
    @org.junit.Test
    public void everyNthChar() {
        char[] source = {'h', 'e', 'l', 'l', 'o'};
        assertArrayEquals(new char[]{'e', 'l'}, utilities.everyNthChar(source, 2));
    }

    @org.junit.Test
    public void everyNthCharWhenNIsGraterThanLength() {
        char[] source = {'h', 'e', 'l', 'l', 'o'};
        assertArrayEquals(new char[]{'h', 'e', 'l', 'l', 'o'}, utilities.everyNthChar(source, 8));
    }

    @org.junit.Test
    public void removePairs() {
        assertEquals("ABCDEF", utilities.removePairs("ABCDDEFF"));
        //      assertEquals("ABCABDEF", utilities.removePairs("ABCCABDEEF"));
        assertNull("Did not get null returned when argument passed was null", utilities.removePairs(null));
        assertEquals("A", utilities.removePairs("A"));
        assertEquals("", utilities.removePairs(""));

    }

    @org.junit.Test
    public void convertor() {
        assertEquals(300, utilities.convertor(10, 5));
    }

    @org.junit.Test(expected = ArithmeticException.class)
    public void convertorDivideByZero() {
        utilities.convertor(10, 0);
    }

    @org.junit.Test
    public void nullIfOddLength() {
        assertNull(null, utilities.nullIfOddLength("odd"));
        assertNotNull(utilities.nullIfOddLength("even"));
    }
}