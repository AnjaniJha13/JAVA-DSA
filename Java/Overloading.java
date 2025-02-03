package com.Anjani;

public class Overloading {
    public static void main(String[] args) {
     //   fun(55);
     //   fun("Naman Sharma");
        int result = sum(5,2);
        System.out.println(result);

    }


    static int sum(int a,int b) {
        return a + b;
    }

    static int sum(int a,int b, int c) {
        return a + b + c;
    }

    static void fun(int a ) {
        System.out.println("first one");
        System.out.println(a);
    }

    static void fun(String name) {
        System.out.println("Second one");
        System.out.println(name);
    }

}

/*
Function overloading: 2 or more functions has same name but different arguments.
It may have same type of arguments or different ( both works)
eg: int,int ; int,string
 */
