import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
//https://leetcode.com/problems/intersection-of-two-arrays/description/
public class IntersectionOfArrays {
    public static int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> h1 = new HashSet<>();
        Set<Integer> intersection = new HashSet<>();
        for (int i = 0; i < nums1.length; i++) {
            h1.add(nums1[i]);
        }
        for (int i = 0; i < nums2.length; i++) {
            if(h1.contains(nums2[i]))
                intersection.add(nums2[i]);
        }
        int[] ans = new int[intersection.size()];
        int x =0;
        for (int i : intersection) {
            ans[x] = i;
            x++;
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4};
        int[] arr2 = {2,3, 2};
        System.out.println(Arrays.toString(intersection(arr1, arr2)));
    }
    // Without using hashset
/*
    public int[] intersection(int[] nums1, int[] nums2) {
        int count=0;
        short[] bucket = new short[1001];

        for(int i=0;i<nums1.length;i++){
            bucket[nums1[i]] = 2;
        }

        for(int i=0;i<nums2.length;i++){
            if(bucket[nums2[i]]==2){
                bucket[nums2[i]] = 1;
                count += 1;
            }
        }

        int[] ans = new int[count];
        int j=0;
        for(int i=0;i<nums2.length;i++){
            if(bucket[nums2[i]]==1){
                ans[j]=nums2[i];
                j++;
                bucket[nums2[i]]=0;
            }
        }
        return ans;
    } */
}
