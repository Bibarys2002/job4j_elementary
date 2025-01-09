package ru.job4j.condition;
import org.junit.Assert;
import org.junit.Test;

public class PointTest {
    @Test
        public void when00to20then2dot82() {
            double expected = 4.12;
            Point a = new Point(1, 2, 5);
            Point b = new Point(3, 4, 2);
            double out = a.distance3d(b);
            Assert.assertEquals(expected, out, 0.01);
        }

        @Test
        public void when02to20then2dot83() {
            double expected = 3.46;
            Point a = new Point(0, 2, 4);
            Point b = new Point(2, 0, 2);
            double out = a.distance3d(b);
            Assert.assertEquals(expected, out, 0.01);
        }

        @Test
        public void when20to20then0() {
            double expected = 1;
            Point a = new Point(2, 0, 5);
            Point b = new Point(2, 0, 6);
            double out = a.distance3d(b);
            Assert.assertEquals(expected, out, 0.01);
        }

        @Test
        public void when13to25then2dot24() {
            double expected = 5.47;
            Point a = new Point(1, 3, 5);
            Point b = new Point(2, 5, 10);
            double out = a.distance3d(b);
            Assert.assertEquals(expected, out, 0.01);
        }

    @Test
    public void when12to34then2dot82() {
        double expected = 2.82;
        Point a = new Point(1, 2);
        Point b = new Point(3, 4);
        double out = a.distance(b);
        Assert.assertEquals(expected, out, 0.01);
    }
    }