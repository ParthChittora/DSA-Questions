public class MissingNumber {
    // https://leetcode.com/problems/missing-number/description/
    public static int missingNumber(int[] nums) {
        int n = nums.length;
        int expectedSum = n * (n + 1) / 2;
        int actualSum = 0;
        for (int num : nums) {
            actualSum += num;
        }
        return expectedSum - actualSum;
    }

    // public void swap(int[] arr , int a , int b){
    //     int temp = arr[a] ;
    //     arr[a] =arr[b];
    //     arr[b]=temp;
    // }
    // public int missingNumber(int[] arr) {
    //     int i = 0;
    //   while(i<arr.length){
    //        int correct = arr[i];
    //         if(correct<arr.length && arr[i]!=arr[correct]){
    //             swap(arr,i,correct);
    //         }
    //         else i++;
    //   }
    //   for(int j = 0 ; j<arr.length ;j++){
    //       if(arr[j] != j)
    //         return j;
    //   }

    //     return arr.length;
    // }
    public static void main(String[] args) {
        int[] arr = {0,1};
        System.out.println(missingNumber(arr));
    }
}
