package ru.job4j.math;

public class MathFunction {

    public static double sum(double first, double second) {
        return first + second;
    }

    public static double multiply(double first, double second) {
        return first * second;
    }

    public static double subtract(double third, double forth) {
        return third - forth;
    }

    public static double divide(double third, double forth) {
        return third / forth;
    }

    public static double sumAndMultiply(double first, double second) {
        return ru.job4j.math.MathFunction.sum(first, second)
                + ru.job4j.math.MathFunction.multiply(first, second);
    }

    public static double subtractAndDivide(double third, double forth) {
        return ru.job4j.math.MathFunction.subtract(third, forth)
                + ru.job4j.math.MathFunction.divide(third, forth);
    }

    public static double sumAndMultiplyAndSubtractAndDivide(double first, double second, double third, double forth) {
        return ru.job4j.math.MathFunction.sumAndMultiply(first, second)
                + ru.job4j.math.MathFunction.subtractAndDivide(third, forth);
    }

    public static void main(String[] args) {
        System.out.println("Результат расчета равен: " + sumAndMultiply(10, 20));
        System.out.println("Результат расчета равен: " + subtractAndDivide(15, 5));
        System.out.println("Результат расчета равен: " + sumAndMultiplyAndSubtractAndDivide(10, 20, 15, 5));
    }
}
