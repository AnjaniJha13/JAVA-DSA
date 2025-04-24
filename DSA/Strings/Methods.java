package com.Anjani;

import java.util.Arrays;

public class Methods {
    public static void main(String[] args) {
        String name = "Abu Dabi";
        System.out.println(name.toCharArray());
        System.out.println(Arrays.toString(name.toCharArray()));
        System.out.println(name);
        System.out.println(name.indexOf('a'));
        System.out.println("      Abu       ".strip());
        System.out.println(Arrays.toString(name.split(" ")));
    }
}
