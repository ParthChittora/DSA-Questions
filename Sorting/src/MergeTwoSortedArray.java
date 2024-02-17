import java.util.Arrays;
public class MergeTwoSortedArray {
    //Can be optimised do it again
    public static void swap(int[]arr ,int a , int b){
        int temp = arr[a];
        arr[a]=arr[b];
        arr[b]=temp;
    }
    public static void insertionSort(int[] arr){
        for(int i = 0 ;i<arr.length-1;i++){
            for(int j=i+1;j>0;j--){
                if(arr[j-1]>arr[j])
                    swap(arr,j-1,j);
                else break;
            }
        }
    }
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        for(int i = m;i<nums1.length;i++){
            nums1[i]=nums2[i-m];
        }
        insertionSort(nums1);
        System.out.print(Arrays.toString(nums1));
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,0,0,0};
        int[] arr2 = {2,6,7};
        merge(arr,3,arr2,3);
    }
}
