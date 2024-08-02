package com.example.humansimulator;

public class Eye extends Organ{
    private String eyeColor;
    private boolean isEyeOpened;

    public Eye(String name, boolean isNormal, String eyeColor, boolean isEyeOpened) {
        super(name, isNormal);
        this.eyeColor = eyeColor;
        this.isEyeOpened = isEyeOpened;
    }

    @Override
    public void PrintCurrentState() {
        super.PrintCurrentState();
        System.out.println("Eye Color: " + eyeColor);
        System.out.println("Is Eye Opened: " + (isEyeOpened ? "Yes" : "No"));
    }

    public String getEyeColor() {
        return eyeColor;
    }

    public void setEyeColor(String eyeColor) {
        this.eyeColor = eyeColor;
    }

    public boolean isEyeOpened() {
        return isEyeOpened;
    }

    public void setEyeOpened(boolean eyeOpened) {
        isEyeOpened = eyeOpened;
    }
}
