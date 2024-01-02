package ru.job4j.ru.job4j.array;

public class ArrayDefinition {
    public static void main(String[] args) {
        Short[] ages = new Short[5];
        System.out.println("Размер массива равен: " + ages.length);
        String[] surnames = new String[100500];
        System.out.println("Размер массива равен: " + surnames.length);
        float[] prices = new float[40];
        System.out.println("Размер массива равен: " + prices.length);
    }
}
