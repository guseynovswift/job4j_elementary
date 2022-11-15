package ru.job4j;

import java.util.Random;

public class Random1 {

    public static void main(String[] args) {

        Random random = new Random();

        int x = random.nextInt(6)+1; // +1 чтобы он не брал 0
        //double y = random.nextDouble();
        //boolean z = random.nextBoolean();

        int y = random.nextInt(6)+1;

        System.out.println(x);
        System.out.println(y);
    }
}
