package ru.job4j;

import java.util.Scanner;

public class Trylopp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = "";

//        while(name.isBlank()) {
//            System.out.print("Enter your name: ");
//            name = scanner.nextLine();
//        }

        do {
            System.out.print("Enter your name: ");
            name = scanner.nextLine();
        } while(name.isBlank()); // тоже самое как сверху только сверху более короче

        System.out.println("Hello "+name);

    }
}
