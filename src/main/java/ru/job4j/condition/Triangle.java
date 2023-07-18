package ru.job4j.condition;

public class Triangle {

    public static boolean exist(double ab, double ac, double bc) {
        return ab + ac > bc && ac + bc > ab && ab + bc > ac;
    }

    public static void main(String[] args) {
        boolean triangle = exist(2, 2, 3);
        System.out.println(triangle);
        triangle = exist(5, 4, 10);
        System.out.println(triangle);
        triangle = exist(2, 1, 3);
        System.out.println(triangle);
        triangle = exist(5, 1, 3);
        System.out.println(triangle);
        triangle = exist(3, 2, 3);
        System.out.println(triangle);
    }
}