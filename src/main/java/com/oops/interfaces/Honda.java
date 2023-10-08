package com.oops.interfaces;

public class Honda implements Car{
    @Override
    public void go() {
        System.out.println("inside honda go method");
    }

    @Override
    public void stop() {

        System.out.println("inside honda stop method");
    }
}
