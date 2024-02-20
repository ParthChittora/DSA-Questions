import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MinAbsoluteDifference {
    public static int minDiff(int[]arr){
        int min = Integer.MAX_VALUE;
        for(int i = 1 ; i < arr.length;i++){
            int dif = Math.abs(arr[i]-arr[i-1]);
            if(dif<min){
                min = dif;
            }
        }
        return min;
    }

    public static List<List<Integer>> minimumAbsDifference(int[] arr) {
        List<List<Integer>>ans = new ArrayList<>();
        Arrays.sort(arr);
        int diff = minDiff(arr);
        for (int i = 1; i <arr.length ; i++) {
            if(Math.abs(arr[i]-arr[i-1])==diff){
                // List<Integer> inner = new ArrayList<>();
//                inner.add(arr[i-1]);
//                inner.add(arr[i]);
                ans.add(Arrays.asList(arr[i-1],arr[i]));
            }
        }
        return ans;
    }


    public static void main(String[] args) {
        int[] arr = {40,11,26,27,-20};
        System.out.println(minimumAbsDifference(arr));
    }
}

