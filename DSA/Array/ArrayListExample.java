package anjani.com;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListExample {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //Syntax
        ArrayList<Integer> list = new ArrayList<>(10);

        list.add(46);
        list.add(655);
        list.add(65321);
        list.add(6446);
        list.add(133232);

//        System.out.println(list.contains(655));
//        System.out.println(list.contains(6552));
//        list.set(0,99);
//        list.remove(2);
//        System.out.println(list);

        //input
        for(int i = 0; i<5; i++){
            list.add(in.nextInt());
        }

        //get item
        for ( int i=0; i<5; i++){
            System.out.println(list.get(i)); //pass index here
        }
      //  System.out.println(list);
    }


}
