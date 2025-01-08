package ru.job4j.condition;

public class Max {
    public static   int max(int a, int b) {
        return a > b  ? a : b;
    }

    public static   int max(int a, int b, int c) {
        return max(a,
                max(b, c));
    }

    public static int max(int a, int b, int c, int d) {
        return max(d,
                max(b, c, d));
    }

    public static void main(String[] args) {
        int rsl = Max.max(2, 4);
        System.out.println(rsl);
        int rsl1 = Max.max(-10, 4, 2);
        System.out.println(rsl1);
        int rsl2 = Max.max(14, 14, 10, 20);
        System.out.println(rsl2);
    }

}
