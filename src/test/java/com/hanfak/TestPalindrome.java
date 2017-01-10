package com.hanfak;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class TestPalindrome {
    private Palinedrome p;

    @Before
    public void setUp() {
        p = new Palinedrome();
    }

    @Test
    public void StringLength1() {
        assertEquals(true, p.evaluate("1"));
    }

    @Test
    public void StringLength2DiffChars() {
        assertEquals(false, p.evaluate("xy"));
    }
}
