public class FindMinInRotatedSortedArray {
    public static int findPivot(int[] arr){
        int start = 0 ;
        int end = arr.length-1;
        while(start<=end){
            int mid = start+(end-start)/2;
            if(mid<end && arr[mid]>arr[mid+1])
                return mid;
            if(mid>start && arr[mid-1]>arr[mid])
                return mid-1;
            else if(arr[start]>arr[mid])
                end =mid-1;
            else start =mid+1;
        }
        return -1;
    }

    public static int findMin(int[] nums) {
        return nums[findPivot(nums)+1];
    }
    public static void main(String[] args) {
        int[] arr= {4,5,6,7,1,2};
        System.out.println(findMin(arr));
    }
}
