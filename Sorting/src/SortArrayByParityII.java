import java.util.Arrays;

public class SortArrayByParityII {
//    public static void swap(int[] arr, int firstIndex, int secondIndex) {
//        int temp = arr[firstIndex];
//        arr[firstIndex] = arr[secondIndex];
//        arr[secondIndex] = temp;
//    }


    public static int[] sortArrayByParityII(int[] nums) {
        int j=0,k=1;
        int[] ans = new int[nums.length];
        for(int i =0 ; i< nums.length;i++){
            if(nums[i]%2==0){
                ans[j]=nums[i];
                j=j+2;
            }
            else{
                ans[k] = nums[i];
                k=k+2;
            }
        }
        return ans;

        //Inplace code

        // int x= nums.length-1;
        // for (int i=0; i<nums.length; i++){
        //     if ((i%2==0 && nums[i]%2==1) || (i%2==1 && nums[i]%2==0)){
        //             //Exchange number at index x and i
        //             int store= nums[i];
        //             nums[i]= nums[x];
        //             nums[x]= store;
        //             x--; i--; //I-- BECAUSE i-- + i++ = 0 means i is not incremented

        //     }
        //     else
        //         x= nums.length-1;
        // }
        // return nums;
    }

    public static void main(String[] args) {
        int[] arr = {888,505,627,846};
        System.out.println(Arrays.toString(sortArrayByParityII(arr)));
    }
}
