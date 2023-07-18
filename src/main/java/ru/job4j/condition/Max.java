package ru.job4j.condition;

public class Max {
    public static int max(int left, int right) {
        int result = left > right ? left : right;
        return result;
    }

    public static void main(String[] args) {
        int rsl = Max.max(2, 4);
        System.out.println(rsl);
        int rsl1 = Max.max(-10, 4);
        System.out.println(rsl1);
        int rsl2 = Max.max(14, 14);
        System.out.println(rsl2);
    }

}
/*package ru.job4j.condition;

public class Film {
    public static String permission(int age) {
        String label = age >= 18 ? "Please, enjoy it." : "You can't watch it.";
        return label;
    }

    public static void main(String[] args) {
        String msg = Film.permission(33);
        System.out.println(msg);
    }
}*/