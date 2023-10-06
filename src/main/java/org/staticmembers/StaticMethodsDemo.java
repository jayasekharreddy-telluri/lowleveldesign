package org.staticmembers;

public class StaticMethodsDemo {

    public static void main(String[] args) {


        StaticMethodsDemo.method();
    }

    static void method(){

        System.out.println("i am static method");
    }
    static{

        System.out.println("i am static block");

    }

}
