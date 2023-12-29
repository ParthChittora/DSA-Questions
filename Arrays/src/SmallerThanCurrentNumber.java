import java.util.Arrays;

public class SmallerThanCurrentNumber {
// Brute force
        // public int[] smallerNumbersThanCurrent(int[] nums) {
        //        int ans[] = new int [nums.length];
        //
        //        for(int i = 0;i<nums.length;i++){ int count =0;
        //            for(int j = 0;j<nums.length;j++){
        //                if(nums[j]<nums[i])
        //                    count++;
        //            }
        //            ans[i] = count;
        //
        //        }
        //        return ans;
        //    }

    // Below approach will take less time but more space
    // Complex to understand 
        public static int[] smallerNumbersThanCurrent(int[] nums) {
        int[] smaller = new int[nums.length];
        int[] counter = new int[101];
        // iterate through each element and count the number of occurences of each value
        for (int i = 0; i < nums.length; i++) {
            counter[nums[i]] ++;
        }
        // add the previous elements to the current one for each element in the counter array
        for (int i = 1; i < counter.length; i++){
            counter[i] += counter[i-1];
        }
        // get the element before the one required for each element in nums
        for (int i = 0; i < nums.length; i++) {
            smaller[i] = nums[i]==0 ? 0 : counter[nums[i] - 1];
        }
        return smaller;
    }

    public static void main(String[] args) {
        int[] nums = {8,1,2,2,3};
        System.out.println(Arrays.toString(smallerNumbersThanCurrent(nums)));
    }
}
