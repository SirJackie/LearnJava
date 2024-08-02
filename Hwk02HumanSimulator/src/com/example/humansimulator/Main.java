package com.example.humansimulator;

public class Main {
    public static void main(String[] args) {
        Man bob = new Man(
                new Eye("Left Eye", true, "Black", true),
                new Eye("Right Eye", false, "Red", false),
                new Dick("Dick", false, 3.0, false)
        );
        bob.PrintStatus();

        // Cure Bob's Right Eyes
        System.out.println("Washing his right eyes, Applying medicine...");
        bob.getRightEye().setEyeColor("Black");
        bob.getRightEye().setEyeOpened(true);
        bob.getRightEye().setNormal(true);
        bob.PrintStatus();

        // Cure Bob's Dick
        System.out.println("Doing Dick Transplant Operation...");
        bob.getDick().setName("New Dick");
        bob.getDick().setDickLength(18.0);
        bob.getDick().setNormal(true);
        bob.PrintStatus();

        // Test the Performance of the Bob's New Dick
        System.out.println("Playing Porn for Bob in order to make him ERECT...");
        bob.getDick().setErect(true);
        bob.getDick().Fuck();
    }
}
