package com.example.oop;

public class Human {

    /*
     * 4. Composition
     * Which means having multiple class instances to compose a bigger class
     * e.g. Car class has fields called Engine, Stereo
     */

    private Phone phone1;
    private Phone phone2;

    public Human(Phone phone1, Phone phone2) {
        this.phone1 = phone1;
        this.phone2 = phone2;
    }

    public Phone getPhone1() {
        return phone1;
    }

    public void setPhone1(Phone phone1) {
        this.phone1 = phone1;
    }

    public Phone getPhone2() {
        return phone2;
    }

    public void setPhone2(Phone phone2) {
        this.phone2 = phone2;
    }
}
