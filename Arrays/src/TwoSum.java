import java.util.*;
// https://leetcode.com/problems/two-sum/
//Brute Force approach /*
/*class Solution {
    public int[] twoSum(int[] arr, int target) {
        int[] ans = new int[2];
        for(int i = 0 ; i< arr.length -1 ; i++){
            for(int j = i+1 ; j< arr.length ;j++){
                if(arr[i]+arr[j]==target){
                    ans[0] = i;
                    ans[1]=j;
                }
            }
        }
        return ans;
    }
} */

// Another approach
/*class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] ans = {-1,-1};
       for (int i = 1; i < nums.length; i++) {
            for (int j = 0; j + i < nums.length; j++) {
                if (target == nums[j] + nums[j + i]) {
                    return new int[]{j, j + i};
                }
            }
        }
        return new int[]{};
    }
}*/
public class TwoSum {
    public static int[] twoSum(int[] nums, int target) {
        int[] ans = new int[2];
        HashMap<Integer,Integer> mp = new HashMap<>();
        for(int i = 0; i< nums.length ; i++ ){
            int second = target - nums[i];
            if(mp.containsKey(second)){
                ans[0] = mp.get(second);
                ans[1] = i ;
            }
            mp.put(nums[i],i);
        }
        return ans;
    }
    public static void main(String[] args) {
       int[] arr ={3,2,4};
       int target = 6;
        System.out.println(Arrays.toString(twoSum(arr, target)));
    }
}
