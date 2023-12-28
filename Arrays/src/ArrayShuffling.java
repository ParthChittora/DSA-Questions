import java.util.Arrays;

//https://leetcode.com/problems/shuffle-the-array/
public  class ArrayShuffling {
    public static int[] shuffle(int[] arr, int n) {
        int[] result = new int[2 * n];

        int index = 0;
        for (int i = 0; i < n; i++) {
            result[index++] = arr[i];
            result[index++] = arr[i + n];
        }
        return result;
    }

    public static void main(String[] args) {
        int[] arr = {2,5,1,3,4,7};
        int n = 3;
        System.out.println(Arrays.toString(shuffle(arr,n)));
    }
}
