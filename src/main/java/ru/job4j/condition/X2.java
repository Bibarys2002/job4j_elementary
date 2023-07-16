package ru.job4j.condition;

public class X2 {
    public static int calc(int a, int b, int c, int x) {
        return a * x * x + b * x + c;
    }

    public static void main(String[] args) {
        int rsl = X2.calc(1, 2, 3, 4);
        System.out.println(rsl);

        int rsl1 = X2.calc(1, 2, 3, 4);
        System.out.println(rsl1);

        int rsl2 = X2.calc(1, 2, 3, 4);
        System.out.println(rsl2);

        int rsl3 = X2.calc(1, 2, 3, 4);
        System.out.println(rsl3);

        int rsl4 = X2.calc(1, 2, 3, 4);
        System.out.println(rsl4);
    }
}
