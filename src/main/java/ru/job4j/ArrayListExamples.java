package ru.job4j;

import java.util.ArrayList;

public class ArrayListExamples {
    public static void main(String[] args) {
        ArrayList<String> bakery = new ArrayList();

        bakery.add("ponchik");
        bakery.add("chakchak");
        System.out.println(bakery); // обычный arraylist

        ArrayList<String> drinks = new ArrayList();
        drinks.add("cola");
        drinks.add("chay");

        ArrayList<ArrayList<String>> shopList = new ArrayList(); // вложенный 2D ArrayList
        shopList.add(bakery);
        shopList.add(drinks);

        System.out.println(shopList.get(1).get(1)); // выбираем что получать
    }
}
