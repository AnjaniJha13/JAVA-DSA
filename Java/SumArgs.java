package com.Anjani;

import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
     //  int result = sum2();  //Function call
      //  System.out.println(result);

        int result = sum3(20, 10);
        System.out.println(result);

    }

    //pass the value of numbers when you are calling the method in main()
    static int sum3( int a, int b){
        int sum = a + b;
        return sum;
    }

    //Return the value

    static int sum2() { //Function
        Scanner in = new Scanner(System.in);

        System.out.print("Enter number 1: ");
        int num1 = in.nextInt();
        System.out.print("Enter number 2: ");
        int num2 = in.nextInt();
        int sum = num1 + num2;
        return sum;
    }

    static void sum() { //Function
        Scanner in = new Scanner(System.in);

        System.out.print("Enter number 1: ");
        int num1 = in.nextInt();
        System.out.print("Enter number 2: ");
        int num2 = in.nextInt();
        int sum = num1 + num2;
        System.out.println("The sum = " +sum); //return type depends on this sentence

    }

    /*

    return_type name () {
    //body
    return statement;
     */

}
