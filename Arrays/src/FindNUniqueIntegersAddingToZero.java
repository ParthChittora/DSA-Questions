import java.util.Arrays;

public class FindNUniqueIntegersAddingToZero {
   //https://leetcode.com/problems/find-n-unique-integers-sum-up-to-zero/description/
    public static int[] sumZero(int n) {
        int arr[] = new int[n];
        int sum=0;
        for(int i =0;i<n-1;i++){
            arr[i]=i+1;
            sum = sum +arr[i];
        }
        arr[n-1]=(-(sum));
        return arr;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(sumZero(7)));
    }
}
