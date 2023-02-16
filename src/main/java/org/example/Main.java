package org.example;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String message;

        do {
            try {
                System.out.print("""
                        Select option to generate token:\s
                        Enter 5 - to generate 5 chars token
                        Enter 10 - to generate 10 chars token
                        Enter 15 - to generate 15 chars token
                        """);
                int number = scanner.nextInt();

                switch (number) {
                    case 5, 10, 15 -> tokenHandler.tokenGenerator(number);
                    default -> System.out.println("The wrong option was chosen");
                }
            } catch (InputMismatchException e) {
                System.out.println("Invalid input type - you cannot enter different type than integer");
            }
            System.out.println("\nWould you like to generate token once again: Yes/No ?");
            scanner.nextLine();
            message = scanner.nextLine();
        } while (!message.equals("No"));
    }
}