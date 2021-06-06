package ru.job4j.condition;

import org.junit.Test;

import static org.junit.Assert.*;

public class SqAreaTest {

    @Test
    public void square1() {
        double expected = 2;
        double perimeter = 6;
        double heightToWidth = 2;
        double out = SqArea.square(perimeter, heightToWidth);
        assertEquals(expected, out, 0.01);
    }

    @Test
    public void square2() {
        double expected = 4;
        double perimeter = 20;
        double heightToWidth = 1.5;
        double out = SqArea.square(perimeter, heightToWidth);
        assertEquals(expected, out, 0.01);
    }

    @Test
    public void square3() {
        double expected = 3;
        double perimeter = 14;
        double heightToWidth = 1.3333333333;
        double out = SqArea.square(perimeter, heightToWidth);
        assertEquals(expected, out, 0.01);
    }
}