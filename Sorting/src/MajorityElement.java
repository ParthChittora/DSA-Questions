public class MajorityElement {
        public static int majorityElement(int[] nums) {
            return helper(nums, 0, nums[0]);
        }
        static int helper(int[] nums, int si, int ref) {
            int c = 0;
            for(int i = si; i < nums.length; i++) {
                if(nums[i]==ref)
                    c++;
                else
                    c--;
                // the count will definitely go to -1 if it is not majority element according to definition
                if(c == -1)
                    // if count goes to -1 it means the number is not majority el and the i will be at the index of
                    // the next element
                    return helper(nums,i,nums[i]);
            }
            return ref;
        }

    public static void main(String[] args) {
        int[] arr = { 2,3,3,3,3,2,1,3};
        int ans =majorityElement(arr);
        System.out.println(ans);
    }
    }

