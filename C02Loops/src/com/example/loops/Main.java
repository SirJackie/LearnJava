package com.example.loops;

public class Main {
    public static void main(String[] args) {
        // Stupid method: re-wrote the code 10 times.
        System.out.println("shit comes out!");
        System.out.println("shit comes out!");
        System.out.println("shit comes out!");
        System.out.println("shit comes out!");
        System.out.println("shit comes out!");
        System.out.println("shit comes out!");
        System.out.println("shit comes out!");
        System.out.println("shit comes out!");
        System.out.println("shit comes out!");
        System.out.println("shit comes out!");

        System.out.println("---------------");

        // For Loop: Just virtually identical in Java and C++ :) NICE
        for (int i = 0; i < 10; i++){
            System.out.println("shit comes out using for loop!");
        }

        System.out.println("---------------");

        // While Loop: Just virtually identical in Java and C++ :) NICE
        int b = 5;
        while (b < 10){
            System.out.println("shit comes out using while loop!");
            b++;
        }

        System.out.println("---------------");

        // Continue: Jump ONLY THIS iteration.
        b = 5;
        while (b < 10){
            if(b == 8){
                b++;
                continue;
            }
            System.out.println("shit comes out using while loop WITH CONTINUE!");
            b++;
        }

        System.out.println("---------------");

        // Do While Loop: Do ONCE first
        b = 5;
        while (b < 5){
            System.out.println("shit comes out using while loop!");  // Output Nothing
            b++;
        }

        System.out.println("---------------");

        b = 5;
        do {
            System.out.println("shit comes out using DO-WHILE loop!");  // Output ONCE
            b++;
        } while (b < 5);
    }
}
