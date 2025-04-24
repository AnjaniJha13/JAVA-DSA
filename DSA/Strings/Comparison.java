package com.Anjani;

public class Comparison {
    public static void main(String[] args) {
        String a = "Kunal";
        String b = "Kunal";
        String c = "Kunal";
      //  System.out.println(c == a); // true

        // ==
       // System.out.println(a == b); //prints true

        // Creating different objects of same value

        String name1 = new String("karan");
        String name2 = new String("karan");

     //   System.out.println(name1 == name2); //prints false (comparator)

        //To check only value
       // System.out.println(name1.equals(name2)); //true as karan == karan (function)

        System.out.println(name1.charAt(0)); //k



    }
}
