package Anjani.com;
//Q.1095

public class LeetcodeSearchInMountain {
    public static void main(String[] args) {

    }

       int search(int[] arr, int target) {
           int peak = peakIndexInMountainArray(arr);
           int firstTry = orderAgnosticBS(arr, target, 0, peak);
           if (firstTry != -1) {
               return firstTry;
           }
           return orderAgnosticBS(arr, target, peak+1, arr.length-1);
       }
        public int peakIndexInMountainArray(int[] arr) {
            int start = 0;
            int end = arr.length-1;

            while( start<=end) {
                int mid = start + (end - start)/2;
                if (arr[mid] > arr[mid+1]) {
                    end = mid;
                } else {
                    start = mid + 1;
                }

            }
            return start;
        }
    static int orderAgnosticBS(int[] arr, int target , int start, int end) {
        //find whether the array is sorted in ascending or descending order
        boolean isAsc = arr[start] < arr[end];


        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] == target) {
                return mid;
            }
//nested if-else

            if (isAsc) {
                if (target < arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            } else {
                if (target > arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }
        return -1;
    }

}

//class Solution {
//    public int findInMountainArray(int target, MountainArray mountainArr) {
//        int peak = peakIndexInMountainArray(mountainArr);
//        int firstTry = orderAgnosticBS(mountainArr, target, 0, peak, true);
//        if (firstTry != -1) {
//            return firstTry;
//        }
//        return orderAgnosticBS(mountainArr, target, peak + 1, mountainArr.length() - 1, false);
//    }
//
//    public int peakIndexInMountainArray(MountainArray arr) {
//        int start = 0;
//        int end = arr.length() - 1;
//
//        while (start < end) {
//            int mid = start + (end - start) / 2;
//            if (arr.get(mid) > arr.get(mid + 1)) {
//                // You are in the descending part of the mountain
//                end = mid;
//            } else {
//                // You are in the ascending part of the mountain
//                start = mid + 1;
//            }
//        }
//        return start; // Peak index
//    }
//
//    static int orderAgnosticBS(MountainArray arr, int target, int start, int end, boolean isAsc) {
//        while (start <= end) {
//            int mid = start + (end - start) / 2;
//            int midVal = arr.get(mid);
//
//            if (midVal == target) {
//                return mid;
//            }
//
//            if (isAsc) {
//                if (target < midVal) {
//                    end = mid - 1;
//                } else {
//                    start = mid + 1;
//                }
//            } else {
//                if (target > midVal) {
//                    end = mid - 1;
//                } else {
//                    start = mid + 1;
//                }
//            }
//        }
//        return -1;
//    }
//}


