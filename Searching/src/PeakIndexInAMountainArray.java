public class PeakIndexInAMountainArray {
//    https://leetcode.com/problems/peak-index-in-a-mountain-array/description/
public static int peakIndexInMountainArray(int[] arr) {
    int start = 0;
    int end = arr.length-1;
    int ans = 0;
    while(start<=end){
        int mid = start + (end-start)/2;
        if(arr[mid+1]>arr[mid]){
            // you are in the ascending part
            start = mid+1;
        }
        else{
            // either u found the ans or you are in the descending part
            ans = mid;
            // If you are in the descending part then we will go backwards in order to search the answer.
            end = mid-1;
        }
    }
    return ans;
}

    public static void main(String[] args) {
        int[] sample = {0,10,5,2};
        System.out.println(peakIndexInMountainArray(sample));
    }
}
