package ru.job4j.condition;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

class MaxTest {
    @Test
    void whenMax1To2Then2() {
        int result = Max.max(1, 2);
        int expected = 2;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenMax15To10Then15() {
        int result = Max.max(15, 10);
        int expected = 15;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenMax1To1Then1() {
        int result = Max.max(-1, 1);
        int expected = 1;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenMax10To10Then10() {
        int result = Max.max(10, 10);
        int expected = 10;
        assertThat(result).isEqualTo(expected);
    }
}