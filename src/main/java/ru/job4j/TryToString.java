package ru.job4j;

class WhatINeed {
    String first = "alomalo";
    int year = 123;

    public String toString() {

        return first + year;
    }
}

public class TryToString {
    public static void main(String[] args) {
        WhatINeed whatINeed = new WhatINeed();
        System.out.println(whatINeed.toString());
    }

}
