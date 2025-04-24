package com.Anjani;
//Leetcode - Q.645
//missing num = index num + 1
//duplicate = no. at 2 missing index(wrong index)
public class SetMismatch {
    public int[] findErrorNums(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            int correct = arr[i] - 1; //int index = arr[i]
            if (arr[i]  != arr[correct]) {
                swap(arr, i, correct);
            } else {
                i++;
            }
        }

        //search for first missing number
        for (int index = 0; index < arr.length; index++) {
            if (arr[index] != index + 1){
                return new int[] {arr[index],index+1};
            }
        }
        return new int[] {-1, -1};
    }

    static void swap(int[] arr,int first , int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
