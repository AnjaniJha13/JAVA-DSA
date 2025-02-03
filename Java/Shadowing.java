package com.Anjani;

public class Shadowing {
    static int x = 90; //this will shadowed at line 8

    public static void main(String[] args) {
        System.out.println(x); //90
        int x;   //local scope will overrides the global scope
       // System.out.println(x); --> scope will begin when value is initialized
        x = 40; //
        System.out.println(x); //40 (calling local scope)
        fun();
    }

    static void fun() {
        System.out.println(x);
    }
}
