package com.example.humansimulator;

public class Organ {
    private String name;
    private boolean isNormal;

    public Organ(String name, boolean isNormal) {
        this.name = name;
        this.isNormal = isNormal;
    }

    public void PrintCurrentState(){
        System.out.println("Organ Name: " + name);
        System.out.println("Organ State: " + (isNormal ? "Normal" : "Diseased"));
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isNormal() {
        return isNormal;
    }

    public void setNormal(boolean normal) {
        isNormal = normal;
    }
}
