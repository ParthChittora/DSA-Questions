public class SpecialArrayWithXElementsGreaterOrEqualToX {
    // https://leetcode.com/problems/special-array-with-x-elements-greater-than-or-equal-x/description

    // a more optimised soln can be made
    public static int specialArray(int[] nums) {
        int num =1 ;
        while(num<=nums.length){
            int count =0;
            for(int i = 0 ; i <nums.length ; i++){
                if(nums[i]>=num){
                    count++;
                }
            }
            if(num==count) {
                return count;
            }
            else num++;
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {0,4,3,0,4};
        System.out.println(specialArray(arr));
    }
}
