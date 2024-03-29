package ru.job4j.array;

public class TwoNumberSum {
    public static int[] getIndexes(int[] array, int target) {
        int i = 0;
        int j = array.length - 1;
        while (i < j) {
            if (array[i] + array[j] == target) {
                return new int[] {i, j};
            } else if (array[i] + array[j] < target) {
                i++;
            } else {
                j--;
            }
        }
            return new int[0];
        }
}

/*public static int[] compress2Point(int[] array) {
    int i = 0;
    int j = 0;
    while (j < array.length) {
        if (array[i] == 0 && array[j] != 0) {
            array[i] = array[j];
            array[j] = 0;
        }
        if (array[i] != 0) {
            i++;
        }
        j++;
    }
    return array;
}*/