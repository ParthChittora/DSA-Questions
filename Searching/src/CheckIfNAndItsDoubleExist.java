import java.util.Arrays;
import java.util.HashSet;
public class CheckIfNAndItsDoubleExist {
    // https://leetcode.com/problems/check-if-n-and-its-double-exist/description/

    // Brute force approach

    // public boolean checkIfExist(int[] arr) {
    //     for(int i = 0 ; i< arr.length;i++){
    //         for(int j =i+1 ; j< arr.length ; j++){
    //             if(arr[i]==arr[j]*2||arr[j]==arr[i]*2){
    //                 return true;
    //             }
    //         }
    //     }
    //     return false;
    // }

    public static boolean checkIfExist(int[] arr) {
        HashSet<Integer> st=new HashSet<>();
        for(int i=0;i<arr.length;i++){
            if(st.contains(arr[i]*2) || (arr[i]%2==0 && st.contains(arr[i]/2)))
                return true;
            st.add(arr[i]);
        }
        return false;
    }

    public static void main(String[] args) {
        int[] arr = {10,2,5,3};
        System.out.println(checkIfExist(arr));
    }
}

