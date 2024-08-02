package com.example.hello;

public class Main {
    public static void main(String[] args) {
        System.out.println("shit comes out!");

        // Types
        // Hint: String S must be upper case; boolean not bool;
        int a = 1;
        long b = 2;
        float c = 3.0f;
        double d = 4.0;
        boolean e = true;
        String f = "SirJackie";
        System.out.println(a + b);
        System.out.println((double)a / b);
        System.out.println(c * d);
        System.out.println(!e);
        System.out.println(f + " is a respectful man lol just joking :)");

        // Operators & If Statement
        // Hint: `} else {` is a java habit, unlike `} \n else {` in C/C++
        // Hint: use || and && instead of `or` and `and` keyword
        // From ChatGPT：在Java中，or 和 and 是作为关键字被禁止使用的。虽然在其他编程语言中，如Python，
        // 它们可以作为逻辑运算符使用，但在Java中，逻辑运算符应该使用 || 和 &&。这主要是由于 Java 的设计目标
        // 之一是保持语言的简洁性和一致性。
        int g = 3;
        if (g > -3 && g < 3){
            System.out.println("Inside the range.");
        }
        else if (g < -3.0 || g > 3.0){
            System.out.println("Outside the range.");
        }
        else{
            System.out.println("Just stepped on the corner!");
        }
    }
}
