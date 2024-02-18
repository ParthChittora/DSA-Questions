import java.util.Arrays;

public class SortArrayByParity {
    public static int[] sortArrayByParity(int[] nums) {
        int j = 0,temp;
        for(int i=0;i<nums.length;i++) {
            if(nums[i] % 2 == 0) {
                // swapping nums[i] and nums[j] i.e starting of array
                temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                // Increasing the index j so that index is shifted
                // it means if on first index there is an even element and if another even element is encountered then it is placed at the next index
                j++;
            }
        }
        return nums;
    }

    public static void main(String[] args) {
        int [] arr = {1,6,4,83,4,62};
        System.out.println(Arrays.toString(sortArrayByParity(arr)));
    }
}
