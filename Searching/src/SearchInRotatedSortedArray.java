public class SearchInRotatedSortedArray {
    public static int binarySearch(int[] arr , int target , int start ,int end){
        while(start<=end){
            int mid = start +(end -start)/2;
            if(target > arr[mid])
                start = mid+1;
            else if(target < arr[mid])
                end = mid-1;
            else return mid;
        }
        return -1;
    }
    public static int pivot(int[] arr){
        int start = 0 ;
        int end = arr.length-1;
        while(start<=end){
            int mid = start+(end-start)/2;
            if(mid<end&&arr[mid+1]<arr[mid]){
                return mid;
            }
            if(mid>start &&arr[mid-1]>arr[mid]){
                return mid-1;
            }
            else if(arr[start]>arr[mid])
                end =mid-1;
            else start =mid+1;
        }

        return -1;
    }
    public static int search(int[] nums, int target) {
        int pi = pivot(nums);
        int firstTry = binarySearch(nums,target,0,pi);
        int secondTry = binarySearch(nums,target,pi+1,nums.length-1);
        if(firstTry != -1)
            return firstTry ;
        else return secondTry;
    }

    public static void main(String[] args) {
        int[] arr = {4,5,6,7,0,1,2};
        int target = 0;
        System.out.println(search(arr, target));
    }
}
