package com.Anjani;

import java.util.Scanner;

public class Largest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();

        //Find the largest number
      /*
      Method-1
        int max = a;
        if(b > max){
            max = b;
        }
        if(c > max){
            max = c;
        }
         System.out.println(max);



      Method -2
        int max = 0;
        if(a>b){
            max = a;
        }else{
            max = b;
        }
        if (c>max) {
            max = c;
        }
        System.out.println(max);

      Method-3
        int max = Math.max(c, Math.max(a,b));
        System.out.println(max);
       */
    }
}
