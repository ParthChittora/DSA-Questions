import java.util.Arrays;

public class CanMakeAPFromSequence {
    public static boolean canMakeArithmeticProgression(int[] arr) {
        Arrays.sort(arr);
        if(arr.length <3){
            return true;
        }
        int diff= arr[1]-arr[0];
        for(int i = 1 ; i<arr.length ;i++){
            if(arr[i]-arr[i-1]!=diff){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int [] ip = {1,3,5,9,7};
        System.out.println(canMakeArithmeticProgression(ip));
    }
}
