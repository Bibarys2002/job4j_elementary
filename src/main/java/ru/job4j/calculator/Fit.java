package ru.job4j.calculator;

public class Fit {
    public static double manWeight(int height) {
        return (height - 100) * 1.15;
    }

    public static double womanWeight(int height) {
        return (height - 110) * 1.15;
    }

    public static void main(String[] args) {
        double man = manWeight(175);
        double woman = womanWeight(165);
        System.out.println("Man 175 is " + man);
        System.out.println("Woman 165 is " + woman);
    }
}