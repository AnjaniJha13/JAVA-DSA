package com.Anjani;

import java.util.Scanner;

public class TypeCasting {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        /*
        float num = input.nextFloat();
        int num = input.nextInt();
         System.out.println(num);

        //Typecasting
        int num = (int)(67.56f);
        System.out.println(num);

        //automatic type promotion in expressions
        int a = 257;  //max size is 256 so we can't store value in byte
        byte b = (byte)(a); // 257 % 256 = 1
        System.out.println(b);


        byte a = 40;
        byte b = 50;
        byte c = 100;
        int d = (a*b)/c; //altough it is byte but in java during such expression it performs promoting like int
        System.out.println(d);
        //40*50=2000 - byte*byte=byte


        //byte --> int
        byte b = 50;
        b = b * 2;

         */

        // int number = 'A';
        // System.out.println("Hola");
        //System.out.println("3 * 5.6452854f");

        byte b = 42;
        char c = 'a';
        short s = 1024;
        int i = 50000;
        float f = 5.67f;
        double d = 0.1234;
        double result = (f * b) + (i / c) - (d * s);
        // float + int - double --> double
        System.out.println((f * b) + " " + (i / c) + " " +  (d - s));
        System.out.println(result);

    }
}


/*
- Float -> int (works) --> directly convertible
- int -> Float (don't work) --> Using typecasting ( int is smaller than float)
 */
