package com.Anjani;

import java.util.ArrayList;

public class Operators {
    public static void main(String[] args) {
        System.out.println('a' + 'b'); // value of ascii code of a and b ( 97 + 98)
        System.out.println("a" + "b"); // ab
        System.out.println('a' + 3); // (97 + 3 = 100)
        System.out.println((char)('a' + 3)); //( d) - (a,b,c,d)

        System.out.println("a" + 1); //a1

        //char : It takes ascii code
        //string: It don't take ascii code, takes string values

        //when int and str is concatenate together it results into integer
        // will be converted to integer that vl call toString()
        //2 objects convert into strings

        System.out.println("Kunal" + new ArrayList<>()); //Kunal[]
        System.out.println("Kunal" + new Integer(56));  //Kunal56

        //System.out.println(new Integer(56) +  new ArrayList<>()); --> Error
        //int + arraylist = error as '+' can only be used fo primitives and string

        System.out.println(new Integer(56) + " " +  new ArrayList<>());
    }

}
