public class MaxProductOfThreeNum {
    public static int maximumProduct(int[] nums) {
        // Arrays.sort(nums);
        //  int prodStart = nums[0] * nums[1] * nums[nums.length-1];
        // int prodEnd = nums[nums.length-1]  * nums[nums.length-2] *nums[nums.length-3];
        // return Math.max(prodStart, prodEnd);//as the absolute value of negative integers can be large which can make their product maximum

        // Same thing but it gets optimised to find max numbers without sorting
        int max1 = Integer.MIN_VALUE;
        int max2 = Integer.MIN_VALUE;
        int max3 = Integer.MIN_VALUE;
        int min1 = Integer.MAX_VALUE;
        int min2 = Integer.MAX_VALUE;
        for (int n:nums) {
            if(n>max1){
                max3 = max2;
                max2 = max1;
                max1 = n;
            } else if (n>max2) {
                max3 = max2;
                max2 = n;
            } else if (n>max3) {
                max3 =n;
            }
            if(n<min1){
                min2 = min1;
                min1 = n;
            }
            else if (n<min2){
                min2 = n ;
            }
        }
        return Math.max(min1*min2*max1 , max1*max2*max3);
    }

    public static void main(String[] args) {
        int[] arr = {-8,1,2,3,4};
        System.out.println(maximumProduct(arr));
    }
}
