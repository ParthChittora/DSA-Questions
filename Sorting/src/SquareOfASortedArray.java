import java.util.Arrays;

public class SquareOfASortedArray {
    public static int[] sortedSquares(int[] nums) {
        // for(int i= 0; i<nums.length;i++){
        //     nums[i]=nums[i]*nums[i];
        // }
        // Arrays.sort(nums);
        // return nums;

        int[] result = new int[nums.length];
        if (nums.length == 1) {
            result[0] = nums[0] * nums[0];
        }

        int right = nums.length - 1;
        int left = 0;

        for (int i = nums.length - 1; i >= 0; i--) {
            if (Math.abs(nums[left]) > Math.abs(nums[right])) {
                result[i] = nums[left] * nums[left];
                left++;
            } else {
                result[i] = nums[right] * nums[right];
                right--;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] arr = {-4,-3,0,1,2};
        System.out.println(Arrays.toString(sortedSquares(arr)));
    }
}
