package ru.job4j.calculator;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class FitTest {

    @Test
    public void manWeight() {
        double height = 185;
        double fitWeight = Fit.manWeight(height);
        double expected = 98;
        Assert.assertEquals(expected, fitWeight, 0.5);
    }

    @Test
    public void womanWeight() {
        double height = 165;
        double fitWeight = Fit.womanWeight(height);
        double expected = 63;
        Assert.assertEquals(expected, fitWeight, 0.5);
    }
}