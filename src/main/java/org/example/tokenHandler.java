package org.example;

import java.util.Random;

public class tokenHandler {
    public static void tokenGenerator(int number) {
        System.out.print("Your token: ");
        for (int i = 0; i < number; i++) {
            int code = new Random().nextInt(94) + 33;
            char b = (char) code;
            System.out.print(b);
        }
    }
}