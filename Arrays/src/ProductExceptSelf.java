import java.util.Arrays;

public class ProductExceptSelf {
//    https://leetcode.com/problems/product-of-array-except-self/description/
    public static int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] lefts = new int[n];
        int[] rights = new int[n];
        int[] result = new int[n];
        // putting the first el of left array 1 as the left product of the first el of nums would be 1
        // Then we calculate the left product of each el from index 1
        lefts[0] = 1;
        for(int i=1; i<n; i++){
            lefts[i] = lefts[i-1] * nums[i-1];
        }
        // calculating right side product from last
        rights[n-1] = 1;
        for(int i=n-2; i>=0; i--){
            rights[i] = rights[i+1] * nums[i+1];
        }
        for(int i=0; i<n; i++){
            result[i] = lefts[i] * rights[i];
        }
        return result;
    }

    public static void main(String[] args) {
        int[] sample = {1,2,0,4};
        System.out.println(Arrays.toString(productExceptSelf(sample)));
    }
}
