import java.util.*;
public class FindKthMissingPositiveInteger {
//    https://leetcode.com/problems/kth-missing-positive-number/description/


    // epic soln
//  public static int findKthPositive(int[] arr, int k) {
//         for(int num : arr)
//         {
//             if(num<=k)
//                 k++;
//             else
//                 break;
//         }
//         return k;
//  }

// soln with binary search logic

    public static int findKthPositive(int[] arr, int k) {
        int start = 0 ;
        int end = arr.length -1;
        while(start<=end){
            int mid = start+(end-start)/2;
            // it'll give the number of missing element from start to mid
            int missing = arr[mid]-(mid+1);
            // if the count of missing number is less than k then we'll go in the right hand side
            if(missing<k){
                start = mid+1;
            }
            // If the count is greater than k then move left
            else{
                end = mid-1;
            }
        }
        if(end!=-1){
            // It checks the no of missing values bw end-1 and end
            int missingValCount = arr[end] - (end+1);
            // Once the missingValCount is found we do the following
            return arr[end]+(k-missingValCount);
        }
        // It means high is -1 and if high is -1 it means the kth missing integer would be smaller than any element in the array,so result is k
        return k ;
    }

    public static void main(String[] args) {
        int[]arr ={1,3,4,5,6};
        System.out.println(findKthPositive(arr ,1));
    }

}
