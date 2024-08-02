package com.example.array;

public class Main {
    public static void main(String[] args) {
        // Array
        // Hint: Array size is immutable after its creation.
        String[] students = new String[5];
        students[1] = "SirJackie";
        students[0] = "Tutor Meisam";
        students[2] = "Tom";
        students[3] = "Jackie Smith";
        students[4] = "Alien Compadshfahraeuifreuiahoi";

        for (int i = 0; i < students.length; i++){
            System.out.println("Student No." + i + " is: " + students[i]);
        }

        // How to compare two strings?
        String str1 = "Sarah";
        String str2 = "Sarah";
        System.out.println(str1 == str2);  // sometimes false, because pointer addresses can be different.
        System.out.println(str1.equals(str2));  // always true, because it compares the content.
    }
}
