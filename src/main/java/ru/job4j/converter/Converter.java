package ru.job4j.converter;

public class Converter {
    public static float rubleToEuro(float value) {
        float rsl = value / 70f;
        return rsl;
    }

    public static float rubleToDollar(float value) {
        float rsl = value / 60f;
        return rsl;
    }

    public static void main(String[] args) {
        float euro = Converter.rubleToEuro(140f);
        float dollar = Converter.rubleToDollar(140f);
        System.out.println("140 rubles are " + euro + " euro.");
        System.out.println("140 rubles are " + (float) dollar + " dollar.");

    }
}


