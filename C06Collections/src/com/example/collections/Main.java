package com.example.collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        /*
         * List: ArrayList, OtherList, ...
         */

        ArrayList<String> names = new ArrayList<>();
        List<String> anotherNames = new ArrayList<>();

        names.add("Bob");
        System.out.println(names.get(0));
        System.out.println(names.size());
        names.clear();
        System.out.println(names.size());
        names.add("Bob");
        names.add("Lisa");
        names.remove("Bob");
        System.out.println(names.get(0));
        System.out.println(names.contains("Lisa"));
        System.out.println(names.contains("Bob"));
        System.out.println(names.isEmpty());
        System.out.println(names.indexOf("Lisa"));
        System.out.println(names.indexOf("Bob"));
        // System.out.println(names.sort());  // Don't know how to use

        // Collections only works with classes (Integer, Boolean), not primitive types (int, boolean)
        // ArrayList<int> intArray = new ArrayList<>();  // Won't work
        ArrayList<Integer> intArray = new ArrayList<>();  // This works

        /*
         * Map: HashMap, OtherMap, ...
         */

        HashMap<String, String> emailMap = new HashMap<>();
        Map<String, String> anotherEmailMap = new HashMap<>();

        emailMap.put("Bob", "bob@gmail.com");
        System.out.println(emailMap.get("Bob"));
        System.out.println(emailMap.size());
        System.out.println(emailMap.remove("Bob"));
        System.out.println(emailMap.size());
        emailMap.put("Bob", "bob@gmail.com");
        System.out.println(emailMap.containsKey("Bob"));
        System.out.println(emailMap.containsValue("bob@gmail.com"));
        emailMap.clear();
        System.out.println(emailMap.isEmpty());

        /*
         * for each loop
         */

        ArrayList<String> strCollection = new ArrayList<>();
        strCollection.add("Bob");
        strCollection.add("Alice");
        strCollection.add("Lisa");
        strCollection.add("Jack");

        for (String str: strCollection){
            System.out.println(str);
        }
    }
}
