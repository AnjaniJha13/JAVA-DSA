
package com.Anjani;

public class Scope {
    public static void main(String[] args) {
        int a = 10; // initializing
        int b = 20;
        String name = "Naman";

        // Block scope
        {
            // int a = 70; // already initialized outside the block in the same method, hence you cannot initialize again
            a = 100; // updating - reassign the original reference variable to some other value
            System.out.println(a);
            int c = 99;
            name = "Naman";
            System.out.println(name);
            // values initialized in this block will remain in block
        }
        System.out.println(a);
        System.out.println(name);
        // System.out.println(c); // cannot use outside the block

        // Scoping in for loops
        for (int i = 0; i < 4; i++) {
            System.out.println(i);
            int num = 90; // this num is limited to the loop
            a = 10000;
        }
        System.out.println(a); // a is still accessible here
    }

    static void random(int marks) {
        int num = 65;
        System.out.println(num);
        System.out.println(marks);
    }
}


/*
1. Anything initialized inside a block is accessed only iniside a block.
2. Anything initialized outside the block can be used inside a block.
3. Anything initialized outside the block cannot be initialized inside a block.
4.  Anything initialized inside a block is cannot be used outside a block.
5. Anything initialized inside a block is can be insitialized outside a block.
 */
