package com.example.oop;

public class Phone {
    private String name;
    private int camera;
    private int memoryRam;
    private int screenSize;

    /*
     * Constructor
     * Press Alt + Insert to quickly auto-generate
     */

    public Phone(String name, int camera, int memoryRam, int screenSize) {
        this.name = name;
        this.camera = camera;
        this.memoryRam = memoryRam;
        this.screenSize = screenSize;
    }

    /*
     * 3. Polymorphism
     * 3.1. Constructive Polymorphism
     * Having multiple constructors is one kind of polymorphism (in Java).
     * I think it's pretty wierd! In C++ in is called Constructor Prototype Overloading.
     */

    public Phone(String name, int memoryRam) {
        this.name = name;
        this.memoryRam = memoryRam;
    }

    public void playMusic (String trackName){
        System.out.println(name + " is playing: " + trackName);
    }

    /*
     * Getters and Setters
     * Press Alt + Insert to quickly auto-generate
     */

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCamera() {
        return camera;
    }

    public void setCamera(int camera) {
        this.camera = camera;
    }

    public int getMemoryRam() {
        return memoryRam;
    }

    public void setMemoryRam(int memoryRam) {
        this.memoryRam = memoryRam;
    }

    public int getScreenSize() {
        return screenSize;
    }

    public void setScreenSize(int screenSize) {
        this.screenSize = screenSize;
    }
}
