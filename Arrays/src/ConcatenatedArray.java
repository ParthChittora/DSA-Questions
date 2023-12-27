import java.util.Arrays;

public class ConcatenatedArray {
 //   https://leetcode.com/problems/concatenation-of-array/submissions/1129872052/
 /* public int[] getConcatenation(int[] nums) {
     int n = nums.length;
     int[]ans = new int[n*2];
     for(int i = 0 ; i< nums.length;i++){
         ans[i]=nums[i];
         ans[i+n]=nums[i];
     }
     return ans ;
 } */


    //public static void arraycopy(Object source_arr, int sourcePos,
    //                            Object dest_arr, int destPos, int len)
    //Parameters :
    //source_arr : array to be copied from
    //sourcePos : starting position in source array from where to copy
    //dest_arr : array to be copied in
    //destPos : starting position in destination array, where to copy in
    //len : total no. of components to be copied.
    public static int[] getConcatenation(int[] nums) {
        int n = nums.length;
        int[]ans = new int[n*2];
        System.arraycopy(nums,0,ans,0,nums.length);
        System.arraycopy(nums,0,ans,nums.length,nums.length);
        return ans ;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,1};
        System.out.println(Arrays.toString(getConcatenation(arr)));
    }
}
