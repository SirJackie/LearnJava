package com.example.humansimulator;

public class Dick extends Organ {
    private double dickLength;
    private boolean isErect;

    public Dick(String name, boolean isNormal, double dickLength, boolean isErect) {
        super(name, isNormal);
        this.dickLength = dickLength;
        this.isErect = isErect;
    }

    @Override
    public void PrintCurrentState() {
        super.PrintCurrentState();
        System.out.println("Dick Length: " + dickLength + "cm");
        System.out.println("Is Dick Erect: " + (isErect ? "Yes" : "No"));
    }

    public void Fuck(){
        if (isErect) {
            System.out.println("Oh! Ah! Ah! Ah!");
        }
        else {
            System.out.println("You need to be erected before you can fuck.");
        }
    }

    public double getDickLength() {
        return dickLength;
    }

    public void setDickLength(double dickLength) {
        this.dickLength = dickLength;
    }

    public boolean isErect() {
        return isErect;
    }

    public void setErect(boolean erect) {
        isErect = erect;
    }
}
