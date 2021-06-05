package ru.job4j.calculator;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class FitTest {

    @Test
    public double manWeight(double height) {
        height = 185;
        double fitWeight = manWeight(height);
        double expected = 98;
        Assert.assertEquals(expected, fitWeight, 0.5);
    }

    @Test
    public double womanWeight(double height) {
        height = 165;
        double fitWeight = womanWeight(height);
        double expected = 63;
        Assert.assertEquals(expected, fitWeight, 0.5);
    }
}