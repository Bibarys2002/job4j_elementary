package ru.job4j.condition;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

class MaxTest {
    @Test
    void whenMax1To2Then2() {
        int result = Max.max(1, 2, 5, 8);
        int expected = 8;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenMax15To10Then15() {
        int result = Max.max(15, 10, 14, 35);
        int expected = 35;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenMax1To1Then1() {
        int result = Max.max(-1, 1, 4, 3);
        int expected = 4;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenMax10To10Then10() {
        int result = Max.max(10, 10, 11, 23);
        int expected = 23;
        assertThat(result).isEqualTo(expected);
    }
}