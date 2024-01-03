public class KadanesAlgoMaxSubarray {
//    https://leetcode.com/problems/maximum-subarray/description/
    // https://www.youtube.com/watch?v=AHZpyENo7k4
//    https://www.geeksforgeeks.org/largest-sum-contiguous-subarray/

    // Brute force :
    /*class Solution {
        public int maxSubArray(int[] nums) {
            long maxSum = -1*Long.MIN_VALUE ;
            if(nums.length==1) return nums[0];
            for(int i = 0 ; i < nums.length ; i++){
                long sum = 0;
                for(int j = i ; j<nums.length ;j++){
                    sum+=nums[j];
                    if(sum>maxSum){
                        maxSum = sum;
                    }
                }
            }
            return (int)maxSum;
        }
    } */
    public static int maxSubArray(int[] nums) {
        int maxSum = Integer.MIN_VALUE;
        int currentSum = 0;
        for (int i = 0; i < nums.length; i++) {
            currentSum += nums[i];
            if (currentSum > maxSum) {
                maxSum = currentSum;
            }
            // here we are eliminating the negative sum if there is a -ve sum then we replace it with zero.
            if (currentSum < 0) {
                currentSum = 0;
            }
        }
        return maxSum;
    }

    public static void main(String[] args) {
        int[] arr = {-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(maxSubArray(arr));
    }
}
