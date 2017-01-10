package com.hanfak;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class TestPalindromeFinder {
    private PalindromeFinder finder;

    @Before
    public void setUp() {
        finder = new PalindromeFinder();
    }

    @Test
    public void stringLength1() {
        assertEquals(true, finder.evaluate("1"));
    }

    @Test
    public void stringLength2DiffChars() {
        assertEquals(false, finder.evaluate("xy"));
    }

    @Test
    public void stringLength2SameChars() {
        assertEquals(true, finder.evaluate("33"));
    }
}
