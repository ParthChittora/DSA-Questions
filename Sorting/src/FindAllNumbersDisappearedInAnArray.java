import java.util.ArrayList;
import java.util.List;

public class FindAllNumbersDisappearedInAnArray {
    public static List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> ans = new ArrayList<>();
        int[] idx_arr = new int[nums.length + 1];
        //Simply checking if the number lies in the array or not if it lies
        // putting the index as 1 else 0
        for (int num : nums) {
            idx_arr[num] = 1;
        }
        for(int i = 0; i < idx_arr.length; i++){
            if(idx_arr[i] == 0 && i != 0) ans.add(i);
        }
        return ans;
    }

    public static void main(String[] args) {
        int [] ip = {1,3,5,6,2,3,7,9};
        System.out.println(findDisappearedNumbers(ip));
    }
}
