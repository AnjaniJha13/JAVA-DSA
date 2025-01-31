package com.Anjani;

import java.util.Scanner ;

public class Loops {
    public static void main(String[] args) {

        /*
        Basic 3 loops:
        - For: If number of iterations is known
        - While:
        -Do-while:The loop will execute atleast once (Runs the body first then checks)

        Syntax for for-loop:

        for(initialization; conditions; increment/decrement){
        //body
        }


        //Print numbers from 1 to 5

        for(int num = 1; num<=5 ; num++){
            System.out.println(num);
        }


        //print numbers from 1 to n

        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        for(int num = 1; num<=n ; num++){
          //  System.out.println(num + " ");
            System.out.println("Hello World");
        }
        */

        /*
        while loops

        Syntax:
        while(conditions){
             //body
             }

        int num = 1;
        while(num<=5){
            System.out.println(num);
            num += 1;
        }
        */



        /*
        do - while loop:

        Syntax: do{
                 //body;
                }while(condition)
         */

        int num = 1;
        do{
            System.out.println(num);
            num++;
        }while(num<=5);

    }
}
