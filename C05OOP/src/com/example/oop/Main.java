package com.example.oop;

public class Main {
    public static void main(String[] args) {
        Phone iPhone = new Phone("iPhone 11", 3, 8, 6);
        Phone another_iPhone = new Phone("iPhone 10", 6);

        /*
         * 1. Encapsulation
         * Use setters and getters to access private properties indirectly,
         * which protects it against external changes
         */

        // iPhone.name = "iPhone 11";
        // iPhone.memoryRam = 8;
        // System.out.println(iPhone.name);
        // System.out.println(iPhone.memoryRam);

        iPhone.setName("iPhone 11");
        iPhone.setMemoryRam(8);
        System.out.println("Name: " + iPhone.getName());
        System.out.println("MemoryRam: " + iPhone.getMemoryRam());

        iPhone.playMusic("KnowKnow - 卖保险");

        // -----------------------------------

        SilentPhone silentPhone = new SilentPhone("SilentPhone", 1, 1, 1);
        System.out.println("Name: " + silentPhone.getName());
        silentPhone.playMusic("KnowKnow - 卖保险");
        silentPhone.playMusic("KnowKnow - 卖保险", "https://exampple.com/music/128947129");
        silentPhone.boomBoom();  // (Mouse Hover || Cursor Hover + Ctrl+Q) to see the special comment.

        // -----------------------------------

        Human sirJackie = new Human(
                new Phone("Mi Phone", 1, 1, 1),
                new Phone("Honor Phone", 1, 1, 1)
        );

        sirJackie.getPhone1().playMusic("KnowKnow - 卖保险");
        sirJackie.getPhone2().playMusic("KnowKnow - 卖保险");

        /*
         * 3. Polymorphism
         * 3.4. The Real Polymorphism: AKA "Duck Type"
         * Which means assign a child class instance to a parent class pointer.
         * This enables abstraction when defining variables.
         */

        Phone diyPhone = new SilentPhone("DIYPhone", 1, 1, 1);
        diyPhone.playMusic("haha");
        // diyPhone.playMusic("haha", "The URL");  // You won't be able to do this

        /*
         * Two more things:
         * 1. null keyword
         * 2. final keyword (AKA immutable in other languages)
         */

        Phone nullPhone = null;
        // nullPhone.playMusic("null");  // Caused an NullPointerException

        final Phone finalPhone = new Phone("iPhone 11", 1, 1, 1);
        finalPhone.playMusic("haha");
        // finalPhone = new Phone("Mi Phone", 1, 1, 1);  // Caused an compile-time error.
    }
}
