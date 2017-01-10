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
    public void StringLength1() {
        assertEquals(true, finder.evaluate("1"));
    }

    @Test
    public void StringLength2DiffChars() {
        assertEquals(false, finder.evaluate("xy"));
    }
}
