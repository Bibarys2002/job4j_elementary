package ru.job4j.calculator;

import static ru.job4j.math.MathFunction.*;
public class MathCalculator {
    public static double sumAndMultiply(double first, double second) {
        return sum(first, second)
                + multiply(first, second);
    }

    public static double subtractAndDivide(double third, double forth) {
        return subtract(third, forth)
                +  divide(third, forth);
    }

    public static double sumAndMultiplyAndSubtractAndDivide(double first, double second, double third, double forth) {
        return (sum(first, second)
                + multiply(first, second))
                + (subtract(third, forth)
                +  divide(third, forth));
    }

    public static void main(String[] args) {
        System.out.println("Результат расчета равен: " + sumAndMultiply(10, 20));
        System.out.println("Результат расчета равен: " + subtractAndDivide(15, 5));
        System.out.println("Результат расчета равен: " + sumAndMultiplyAndSubtractAndDivide(10, 20, 15, 5));
    }
}
