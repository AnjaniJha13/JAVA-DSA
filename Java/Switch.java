package com.Anjani;

import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
      //  String fruit = in.next();

        /*
        //.equals :- use to  compare
      -  Method 1:

        switch (fruit) {
            case "Mango":
                System.out.println("King of fruits");
                break;
            case "Apple":
                System.out.println("A doctor fruit");
                break;
            case "Orange":
                System.out.println("King of Nagpur");
                break;
            case "Grapes":
                System.out.println("King of Wine");
                break;
            default:
                System.out.println("Please enter a valid fruit");
        }
 }


NOTE:
1. Cases have to be the same type as expressions, must be a constant or literal
2. Duplicate case values are not allowed
3. Break is use to terminate the sequence
4. If break is ot used, it will continue to next case
5. Default will execute when none of the above class does
6. If default is not at the end,put break after it

        //- Method-2

        switch (fruit) {
            case "Mango" -> System.out.println("King of fruits");
            case "Apple" -> System.out.println("A doctor fruit");
            case "Orange" -> System.out.println("King of Nagpur");
            case "Grapes" -> System.out.println("King of Wine");
            default -> System.out.println("please enter a valid fruit");

        }

          //Weeks
        //Method-1
        int day = in.nextInt();
        switch(day){
            case 1 -> System.out.println("Monday");
            case 2 -> System.out.println("Tuesday");
            case 3 -> System.out.println("Wednesday");
            case 4 -> System.out.println("Thursday");
            case 5 -> System.out.println("Friday");
            case 6 -> System.out.println("Saturday");
            case 7 -> System.out.println("Sunday");
            default -> System.out.println("please enter a valid day");

        }



        //Method-2
        int day = in.nextInt();
        switch(day) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                System.out.println("Weekdays");
                break;
            case 6:
            case 7:
                System.out.println("Weekends");
                break;
        }


         */
        //Method-3

        int day = in.nextInt();
        switch(day) {
            case 1,2,3,4,5 -> System.out.println("Weekdays");
            case 6,7 -> System.out.println("Weekends");
        }

    }

}
