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

    @Test
    public void stringLength3EndCharsDiff() {
        assertEquals(false, finder.evaluate("xyz"));
    }

    @Test
    public void stringLength3EndCharsSame() {
        assertEquals(true, finder.evaluate("949"));
    }

    @Test
    public void stringLength4EndCharsDiff() {
        assertEquals(false, finder.evaluate("abcd"));
    }

    @Test
    public void stringLength4EndCharsSameInnerDiff() {
        assertEquals(false, finder.evaluate("1231"));
    }

    @Test
    public void stringLength5EndCharsDiff() {
        assertEquals(false, finder.evaluate("12345"));
    }

    @Test
    public void stringLength5EndCharsSameInnerSameMiddleSame() {
        assertEquals(true, finder.evaluate("12321"));
    }

    @Test
    public void stringLengthOddNotPalindrome() {
        assertEquals(false, finder.evaluate("1357a31"));
    }
}
