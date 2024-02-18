import java.util.Arrays;
public class LargestPerimeterTriangle {
    // Constraint for making a triangle two sides sum should be greater than the third side
    public static boolean checkTriangle(int a , int b , int c ){
        return a+b>c;
    }
    public static int largestPerimeter(int[] nums) {

        Arrays.sort(nums);
        for(int i = 1; i<=nums.length-2;i++){
            if(checkTriangle(nums[nums.length-2-i],nums[nums.length-1-i],nums[nums.length-i])){
                return nums[nums.length-i]+nums[nums.length-2-i]+nums[nums.length-1-i];
            }
        }
        return 0;

    }

    public static void main(String[] args) {
        int[] arr = {2,3,3,6};
        System.out.println(largestPerimeter(arr));
    }
}
