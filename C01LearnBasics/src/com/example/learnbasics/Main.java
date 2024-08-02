package com.example.learnbasics;

public class Main {
    public static void main(String[] args) {
        int a = 5;

        // Switch Statement
        // Hint: You do need to 'break;' , otherwise it won't stop.
        // Hint: every switch needs a default case.
        switch (a){
            case 1:
                System.out.println("a is 1");
                break;
            case 2:
                System.out.println("a is 2");
                break;
            case 3:
                System.out.println("a is 3");
                break;
            default:
                System.out.println("a is not 1/2/3");
        }
    }
}
