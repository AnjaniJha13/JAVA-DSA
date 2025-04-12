package anjani.com;

import java.util.Arrays;
import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
//        int[] arr = new int[5];
//        arr[0] = 23;
//        arr[1] = 25;
//        arr[2] = 27;
//        arr[3] = 28;
//        arr[4] = 30;
        //System.out.println(arr[0]);

        //input using for loops
//        for (int i = 0; i <arr.length ; i++) {
//            arr[i] = in.nextInt();
//        }

//        for (int i = 0; i <arr.length ; i++) {
//         //   System.out.println(arr[i] + " ");
//        }

        //for every element in array,print the element
//        for (int num : arr)  {
//          //  System.out.println(num + " ");//num represents element of the array
//        }

        //Array of Objects
        String[] str = new String[4];
        for (int i = 0; i < str.length; i++) {
            str[i] = in.next();
        }
        System.out.println(Arrays.toString(str));

        //modify
        str[1] = "piya";
        System.out.println(Arrays.toString(str));
    }
}
