import java.util.Arrays;
public class MaxProductOfTwoNum {
    public static int maxProduct(int[] nums) {
        //    Arrays.sort(nums);
        //    return ((nums[nums.length-1]-1)*(nums[nums.length -2]-1));
        int max1 = Integer.MIN_VALUE;
        int max2 = Integer.MIN_VALUE;
        for (int n:nums) {
            if(n>max1){
                max2 = max1;
                max1 = n;
            } else if (n>max2) {
                max2 = n;
            }
        }
        return ((max2-1)*(max1-1));
    }

    public static void main(String[] args) {
        int[] arr = {1,5,4,5};
        System.out.println(maxProduct(arr));
    }
}
