package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class PointTest {
    @Test
   public  void when00to20then2() {
        double expected = 2;
        int x1 = 0;
        int y1 = 0;
        int x2 = 2;
        int y2 = 0;
        double out = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, 0.01);    }

    @Test
    public void when00to21then3() {
        double expected = 2.23;
        int x1 = 0;
        int y1 = 0;
        int x2 = 2;
        int y2 = 1;
        double out = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when02to20then2dot83() {
        double expected = 2.83;
        int x1 = 0;
        int y1 = 2;
        int x2 = 2;
        int y2 = 0;
        double out = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when12to00the3() {
        double expected = 2.23;
        double out = Point.distance(1, 2, 0, 0);
        Assert.assertEquals(expected, out, 0.01);    }

}