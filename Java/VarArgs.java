package com.Anjani;

import java.util.Arrays;

public class VarArgs {
    public static void main(String[] args) {
      //  fun();
      //  multiple(2,3,"Anjani","Adarsh","Akshay");
        demo(2,3,4);
    }

    static void demo(int ...v) {
        System.out.println(Arrays.toString(v)); //ambiguity
    }
//Ambiguity: When code is run nd don't know what will run first

    static void demo(String ...v) {
        System.out.println(Arrays.toString(v));
    }


    static void multiple(int a,int b,String ...v){
        System.out.println(Arrays.toString(v));

    }

    static void fun(int  ...v) {
        System.out.println(Arrays.toString(v));
    }
}
