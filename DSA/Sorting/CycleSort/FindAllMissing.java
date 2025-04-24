package com.Anjani;
//Q.448 , 281
//Google
import java.util.List;
import java.util.ArrayList;

public class FindAllMissing {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        int i = 0;
        while(i <nums.length) {
            int index = nums[i] - 1 ;
            if (nums[i] != nums[index]){
                swap(nums, i, index);
            } else {
                i++;
            }

        }

        // just find missing numbers
        List<Integer> ans = new ArrayList<>();
        for (int index= 0; index < nums.length ; index++) {
            if(nums[index] != index+1) {
                ans.add(index + 1);
            }
        }

        return ans;
    }

    static void swap(int[] arr,int first , int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
