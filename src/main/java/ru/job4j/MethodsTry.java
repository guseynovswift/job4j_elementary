package ru.job4j;

public class MethodsTry {
    public static void main(String[] args) {
        String name = "Ali";

        hello("asdasd", 12);

    }

    static void hello(String asdasd, Integer age) {
        System.out.println("Hello "+asdasd + " " + age);
    }

    static void hello(Integer age, String asdasd) {
        System.out.println("Hello "+asdasd + " " + age);
    }
}
