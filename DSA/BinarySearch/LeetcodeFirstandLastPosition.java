package Anjani.com;
//Q.34

public class LeetcodeFirstAndLastPosition {
    public static void main(String[] args) {
        int[] nums = {5,7,7,8,8,10};
        int target = 7;
        int[] result = searchRange(nums , target);
        System.out.println("[" + result[0] + "," + result[1] + "]");

    }

    public static int[] searchRange( int[] nums, int target) {
        int[] ans = {-1, -1};
        //check for first occurrence if target first
        ans[0] = search(nums,target,true);
        if (ans[0] != -1) {
            ans[1] = search(nums, target, false);
        }


        return ans;
    }

    //this function just returns the index value of element
    public static int search(int[] nums, int target, boolean findStartIndex) {
        int ans = -1;
        int start = 0;
        int end = nums.length-1;

        while(start <= end) {
            //find middle element
            //int mid = (start+end)/2

            int mid = start + (end-start)/2;

            if (target < nums[mid]) {
                end = mid - 1;
            } else if (target > nums[mid]) {
                start = mid + 1;
            } else {
                //potential ans found
                ans = mid;
                if (findStartIndex) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }
        return ans;
    }
}
