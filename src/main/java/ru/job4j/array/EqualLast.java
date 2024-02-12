package ru.job4j.array;

public class EqualLast {
    public static boolean check(int[] left, int[] right) {
        for (int i = right.length - 1; i >= 0; i--) {
            if (left[i] == right[i]) {
                return true;
            }
        }
        return false;
    }
}