import java.util.Arrays;
//https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/description/
public class FirstAndLastPositionOfTarget {
    public static int[] searchRange(int[] nums, int target) {
        int[] ans = new int[2];
        ans[0] = search(nums,target,true);
        ans[1] = search(nums,target,false);
        return ans;
    }
    static int search(int[] nums , int target , boolean firstIndex){
        int start = 0;
        int end = nums.length-1;
        int ans = -1;
        while(start <= end){
            int mid = start + (end -start)/2;
            if (target > nums[mid])
                start = mid+1;
            else if (target < nums[mid])
                end = mid-1;
            else{
                ans = mid;
                if(firstIndex)
                    end = mid-1;
                else start = mid+1;
            }}
        return ans;
    }

    public static void main(String[] args) {
        int[] arr = {5,7,7,8,8,10};
        int target = 8 ;
        System.out.println(Arrays.toString(searchRange(arr, target)));
    }
}
