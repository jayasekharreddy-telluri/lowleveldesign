package com.oops.polymorphism;

public class CompileTimeBinding {

    void add() {
        System.out.println("add method");
    }

    void add(int a, int b) {

        System.out.println("add method a + b =" + a + b);
    }


    void add(float a, float b) {


        System.out.println("add method a * b =" + a * b);

    }

    public static void main(String[] args) {

        CompileTimeBinding compileTimeBinding = new CompileTimeBinding();

        compileTimeBinding.add();

        compileTimeBinding.add(2, 3);

        compileTimeBinding.add(3.4f, 5.6f);


    }

}
