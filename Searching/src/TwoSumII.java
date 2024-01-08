import java.util.Arrays;

public class TwoSumII {
    /*public int binarySearch(int[]arr , int target,int start){

    int end = arr.length-1;
    while(start<=end){
        int mid = start +(end -start)/2;
        if(arr[mid]>target)
           end=mid-1;
        else if (arr[mid]<target)
            start = mid+1;
        else return mid;
    }
    return -1;
}
public int[] twoSum(int[] arr, int target) {
    for(int i=0;i<arr.length;i++){
        int second = target-arr[i];
        int index2 = binarySearch(arr,second,i+1);
        if(index2!=-1)
            return new int[] {i+1,index2+1};
    }
    return new int[] {-1,-1};
}*/
    public static int[] twoSum(int[] numbers, int target) {
        int l = 0, r = 1;
        while (true) {
            //try to dry run it and see the previous submission for naive method
            // It's a sorted matrix
            // so if the sum of adjacent elements is less than target
            if (numbers[l] + numbers[r] < target) {
                l++;
                r++;
            }
            else if (numbers[l] + numbers[r] > target) {
                l--;
            }
            // numbers[l]+numbers[r]== target
            else return new int[]{l+1,r+1};
        }
    }

    public static void main(String[] args) {
        int[] sample = {2,7,11,15};
        int target = 9;
        System.out.println(Arrays.toString(twoSum(sample,target)));
    }
}
