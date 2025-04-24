package com.Anjani;

public class PrettyPrinting {
    public static void main(String[] args) {
        float a = 453.1234f;
        float b = 453.12745f; //round off .127 -> .13
        //System.out.printf("Formatted number is %.2f" ,a);
      //  System.out.printf("Formatted number is %.2f" ,b);

       // System.out.println(Math.PI); - 3.14349656564
      //  System.out.printf("Pi: %.3f" , Math.PI); - 3.142

        //placeholder : % s
        System.out.printf("Hello my name is %s and he is %s", "Anjani" ,"Gaurav");


    }
}

/*
There are many format specifiers we can use. Here are some common ones:

%c - Character
%d - Decimal number (base 10)
%e - Exponential floating-point number
%f - Floating-point number
%i - Integer (base 10)
%o - Octal number (base 8)
%s - String
%u - Unsigned decimal (integer) number
%x - Hexadecimal number (base 16)
%t - Date/time
%n - Newline
 */
