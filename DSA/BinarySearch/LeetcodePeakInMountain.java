package Anjani.com;
//Q.852 ,162,1095
public class LeetcodePeakInMountainArray {

    public int peakInMountainArray(int[] arr) {
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

}
