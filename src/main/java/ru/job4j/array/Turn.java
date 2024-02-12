package ru.job4j.array;

public class Turn {
    public static int[] back(int[] array) {
        int backarray;
        for (int index = 0; index < array.length / 2; index++) {
            backarray = array[index];
            array[index] = array[array.length - index - 1];
            array[array.length - index - 1] = backarray;
        }
        return array;
    }
}