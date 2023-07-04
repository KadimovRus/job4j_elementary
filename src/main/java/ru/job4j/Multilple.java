package ru.job4j;

public class Multilple {
    public static void main(String[] args) {
        for (int i = 1; i < 10; i++) {
            String s = String.format("1 * %s = %s", i, i);
            System.out.println(s);
        }
    }
}
