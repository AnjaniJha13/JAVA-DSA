//Leetcode  Q.41
public class LeetcodeFirstMeetingPositive {
    public static int firstmissingNumber(int[] arr) {
    int i = 0;
    while(i < arr.length) {
        int correct = arr[i] -1 ; //int index = arr[i]
        if (arr[i] > 0 && arr[i] <= arr.length && arr[i] != arr[correct]){
            swap(arr, i,correct);
        } else {
            i++;
        }

    }

    //search for first missing number
    for (int index = 0; index < arr.length; index++) {
        if (arr[index] != index + 1){
            return index + 1;
        }
    }
    //case 2 (if element is not there in array)
    return arr.length + 1;
}

static void swap(int[] arr,int first , int second) {
    int temp = arr[first];
    arr[first] = arr[second];
    arr[second] = temp;
  }
}
