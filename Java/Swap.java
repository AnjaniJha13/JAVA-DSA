package com.Anjani;

public class Swap {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        // Attempt to swap numbers using the swap method.
        // However, the swap method only swaps the local copies of a and b.
        swap(a, b);

        // This will print "10 20" because primitives are passed by value.
        System.out.println(a + " " + b);

        String name = "Anjani Jha";
        changeName(name);
        // This will print "Anjani Jha" because the changeName method
        // only reassigns the local copy of the reference.
        System.out.println(name);
    }

    static void changeName(String name) {
        // Reassigning the local parameter does not affect the original variable.
        name = "Rahul Mishra"; // A new String object is created.
    }

    static void swap(int num1, int num2) {
        int temp = num1;
        num1 = num2;
        num2 = temp;
        // This swap only affects num1 and num2 inside the swap method.
        System.out.println("Inside swap method: " + num1 + " " + num2);
    }
}
