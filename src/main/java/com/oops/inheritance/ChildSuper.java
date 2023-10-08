package com.oops.inheritance;

public class ChildSuper extends ParentSuper{


    void f1(){

        super.f1();
        System.out.println("inside ChildSuper");
    }
}
