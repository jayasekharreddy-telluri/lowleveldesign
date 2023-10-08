package com.oops.abstarction;

public abstract class BMW {

    void commonFunctionality() {

        System.out.println("inside commonFunctionality method");

    }
    abstract void acceleration();

    public static void main(String[] args) {

        System.out.println("inside main method");
    }
}
