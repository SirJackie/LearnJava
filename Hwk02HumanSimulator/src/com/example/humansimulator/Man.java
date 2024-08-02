package com.example.humansimulator;

public class Man {
    private Eye leftEye;
    private Eye rightEye;
    private Dick dick;

    public Man(Eye leftEye, Eye rightEye, Dick dick) {
        this.leftEye = leftEye;
        this.rightEye = rightEye;
        this.dick = dick;
    }

    public void PrintStatus(){
        System.out.println("@@@ NEW STATUS @@@");
        leftEye.PrintCurrentState();
        System.out.println("------------------");
        rightEye.PrintCurrentState();
        System.out.println("------------------");
        dick.PrintCurrentState();
        System.out.println("------------------");
    }

    public Eye getLeftEye() {
        return leftEye;
    }

    public void setLeftEye(Eye leftEye) {
        this.leftEye = leftEye;
    }

    public Eye getRightEye() {
        return rightEye;
    }

    public void setRightEye(Eye rightEye) {
        this.rightEye = rightEye;
    }

    public Dick getDick() {
        return dick;
    }

    public void setDick(Dick dick) {
        this.dick = dick;
    }
}
