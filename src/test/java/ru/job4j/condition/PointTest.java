package ru.job4j.condition;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;

class PointTest {
    @Test
    void when00to20then2() {
        double expected = 2;
        double out = Point.distance(0, 0, 2, 0);
        assertThat(out).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void when00to21then3() {
        double expected = 3;
        double out = Point.distance(0, 0, 2, 1);
        assertThat(out).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void when00to11then2() {
        double expected = 2;
        double out = Point.distance(0, 0, 1, 1);
        assertThat(out).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void when12to00the3() {
        double expected = 3;
        double out = Point.distance(1, 2, 0, 0);
        assertThat(out).isEqualTo(expected, withPrecision(0.01));
    }

}