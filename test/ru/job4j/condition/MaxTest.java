package ru.job4j.condition;

import org.junit.Test;

import static org.junit.Assert.*;

public class MaxTest {

    @Test
    public void whenMax1To2Then2() {
        int left = 1;
        int right = 2;
        int result = Max.max(left, right);
        int expected = 2;
        assertEquals(result, expected);
    }

    @Test
    public void whenMax10To3Then10() {
        int left = 10;
        int right = 3;
        int result = Max.max(left, right);
        int expected = 10;
        assertEquals(result, expected);
    }

    @Test
    public void whenMax5To5Then5() {
        int left = 5;
        int right = 5;
        int result = Max.max(left, right);
        int expected = 5;
        assertEquals(result, expected);
    }

    @Test
    public void whenMax25To0Then5() {
        int left = 0;
        int right = 25;
        short addition = 15;
        byte value = 2;
        int result = Max.max(left, right, addition, value);
        int expected = 80;
        assertEquals(result, expected);
    }

    @Test
    public void whenMax5To15Then20() {
        int left = 5;
        int right = 15;
        short addition = 5;
        int result = Max.max(left, right, addition);
        int expected = 20;
        assertEquals(result, expected);
    }
}