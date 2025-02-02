package com.Anjani;

import java.util.Scanner;


public class NestedSwitch {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int empID = in.nextInt();
        String department = in.next();
        switch (empID) {
            case 1:
                System.out.println("Naman Sharma");
                break;

            case 2:
                System.out.println("Rahul Verma");
                break;

            case 3:
                System.out.println("Emp Number 3");
                switch (department) {
                    case "IT":
                        System.out.println("IT Department");
                        break;
                    case "Management":
                        System.out.println("Management Department");
                        break;
                    default:
                        System.out.println("No department entered");
                }
                break;
            default:
                System.out.println("please enter correct EMPID");


                //Method -2
                switch(empID) {
                    case 1 -> System.out.println("Naman Sharma");
                    case 2 -> System.out.println("Rahul Verma");
                    case 3 -> {
                        System.out.println("Emp Number 3");
                        switch(department) {
                            case "IT" -> System.out.println("IT Department");
                            case "Management" -> System.out.println("Management Department");
                            default -> System.out.println("No department entered");

                        }
                    }
                    default -> System.out.println("Enter correct EMPID");
                }
          }

    }
}
