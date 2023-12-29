// https://leetcode.com/problems/create-target-array-in-the-given-order/description/
import java.util.*;
public class TargetArray {
    public static int[] createTargetArray(int[] nums, int[] index) {
        List<Integer> ans = new ArrayList<>();
        for(int i = 0 ; i <nums.length;i++){
            ans.add(index[i],nums[i]);
        }
        int[] target = new int[ans.size()];
        for(int i = 0 ; i<ans.size();i++){
            target[i] = ans.get(i);
        }
        return target;
    }

    public static void main(String[] args) {
        int[] nums ={0,1,2,3,4} ;
        int [] index ={0,1,2,2,1} ;
        System.out.println(Arrays.toString(createTargetArray(nums,index)));
    }
}
