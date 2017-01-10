package com.hanfak;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class TestPalindrome {

    @Test
    public void canCreateObject() {
        new Palinedrome();
    }

    @Test
    public void returnsTrue() {
        Palinedrome p = new Palinedrome();
        assertEquals(true, p.evaluate("1"));
    }
}
