package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class PointTest {

    @Test
    public void distance1() {
        int x1 = 0;
        int y1 = 0;
        int x2 = 2;
        int y2 = 0;
        double expected = 2.0;
        double result = Point.distance(0, 0, 2, 0);
        Assert.assertEquals(expected, result, 0.1);
    }

    @Test
    public void distance2() {
        int x1 = 0;
        int y1 = 0;
        int x2 = 3;
        int y2 = 3;
        double expected = 4.2;
        double result = Point.distance(0, 0, 3, 3);
        Assert.assertEquals(expected, result, 0.1);
    }

    @Test
    public void distance3() {
        int x1 = -1;
        int y1 = -1;
        int x2 = 4;
        int y2 = 6;
        double expected = 8.6;
        double result = Point.distance(-1, -1, 4, 6);
        Assert.assertEquals(expected, result, 0.1);
    }
}
