package com.Anjani;

import java.util.Scanner;

public class CaseCheck {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
     //trim: removes the spaces
     //charAt: index or location of the character
        // System.out.println(in.next().trim());

      //  Method 1:
       // String word="hello";
       // System.out.println(word.charAt(0));

        //Method 2:
        char ch = in.next().trim().charAt(0);

        if(ch>='a' && ch <='z'){
            System.out.println("Lowercase");
        }else{
            System.out.println("Uppercase");
        }

    }
}
