package com.example.scannerAndRandom;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Random
        Random random = new Random();
        int number;
        number = random.nextInt();
        System.out.println("Generated Random Number Is: " + number);
        number = random.nextInt(20) + 1;  // Range: 1~20 (0~19 + 1)
        System.out.println("Generated Random Number Is: " + number);

        // Scanner
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input an int:");
        int intInput = scanner.nextInt();
        System.out.println("Input a string with no spaces:");
        String strInput = scanner.next();
        System.out.println("intInput: " + intInput);
        System.out.println("strInput: " + strInput);
    }
}
