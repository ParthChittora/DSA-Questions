import java.util.Arrays;

public class IntersectionOfArraysII {
    /*public static int[] intersect(int[] nums1, int[] nums2) {
        int[]temp1 = new int [1001];
        int[]temp2 = new int [1001];
        int count =0 ;
        for(int i= 0 ; i< nums1.length;i++){
            temp1[nums1[i]]++;
        }
        for(int i= 0 ; i< nums2.length;i++){
            temp2[nums2[i]]++;
        }
        for (int i = 0; i < 1001; i++) {
            if(temp1[i]!=0&&temp2[i]!=0){
                count += Math.min(temp1[i],temp2[i]);
            }
        }
        int []ans = new int[count];
        int j =0;
        for (int i = 0; i < 1001; i++) {
            if(temp1[i]!=0&&temp2[i]!=0){
                for (int k = 0; k <Math.min(temp1[i],temp2[i]) ; k++) {
                    ans[j]=i;
                    j++;
                }
            }
        }

        return ans;
    }*/
    public static int[] intersect(int[] nums1, int[] nums2) {
        int[] intersection = new int[1001];
        int[] result = new int[1000];
        // freq of occurrence of every element of nums1 is calculated and stored
        for(int i : nums1){
            intersection[i]++;
        }
        int ind = 0;
        for(int i : nums2){
            // now we are checking whether the elements of num2 are present in nums1
            if(intersection[i] > 0){
                // if present intersection[i]>0 and the value of intersection[i] will give the no of times it is there
                result[ind] = i;// here we add that element to result
                intersection[i]--;// decreased the count by 1
                ind++;
            }
        }
        // To get the array till index only not like [2,2,0,0,0,0,0,0,0,0...] it'll trim and we'll get [2,2]
        return Arrays.copyOfRange(result, 0, ind);
    }

    public static void main(String[] args) {
        int [] arr1 = {1,2,2,1};
        int[] arr2 = {2,2};
        System.out.println(Arrays.toString(intersect(arr1 ,arr2)));
    }
}

