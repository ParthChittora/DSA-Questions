import com.sun.security.jgss.GSSUtil;

// https://leetcode.com/problems/number-of-good-pairs/submissions/
public class GoodPairs {
    // Brute force approach with o(n sq) complexity
    // public int numIdenticalPairs(int[] nums) {
    //     int count = 0;
    //    for (int i =0;i<nums.length-1;i++){
    //        for(int j=i+1;j<=nums.length-1;j++){
    //            if(nums[i]==nums[j])
    //             count++;
    //        }
    //    }
    //    return count;
    // }
    public static int numIdenticalPairs(int[] nums) {
        // Basically here we create an array for occurences of all the elements from 1 to 101, based on that count is
        // calculated
        int ans = 0, cnt[] = new int[101];
        for (int a: nums) {
            ans += cnt[a]++;
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] nums = {1,2,3,1,1,3,3};
        System.out.println(numIdenticalPairs(nums));
    }
}
