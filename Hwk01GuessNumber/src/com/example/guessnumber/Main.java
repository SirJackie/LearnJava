package com.example.guessnumber;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Generate a random number
        Random random = new Random();
        int answer = random.nextInt(100) + 1;  // Range: 1~100

        // Welcome message
        System.out.println("----- Guess Number! -----");
        System.out.println("Rule: Guess a number between 1 to 100!");

        // Initialize Scanner
        Scanner scanner = new Scanner(System.in);
        int userInput;

        while (true){
            System.out.println("Give me a number:");
            userInput = scanner.nextInt();

            if (userInput == answer){
                break;
            } else if (userInput < answer) {
                System.out.println("Too small!");
            } else {
                System.out.println("Too large!");
            }
        }

        System.out.println("You win!");
    }
}
