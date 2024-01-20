import java.util.Arrays;
public class ContainsDuplicate {
    public static boolean containsDuplicate(int[] nums) {
        Arrays.sort(nums);
        for(int i = 1 ; i<nums.length;i++){
            if(nums[i]==nums[i-1]){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,4,3,5,3};
        System.out.println(containsDuplicate(arr));
    }
}
