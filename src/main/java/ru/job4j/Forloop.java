package ru.job4j;

public class Forloop {
    public static void main(String[] args) {
        String symbol = "$";
        for (int i=1; i<=5; i++) {
            System.out.println(symbol);
            for (int j=1; j<=4; j++){
                System.out.print(symbol);
            }
        }
    }
}
