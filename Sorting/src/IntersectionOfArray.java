import java.util.Arrays;

public class IntersectionOfArray {

        public static int[] intersection(int[] nums1, int[] nums2) {
       /*
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
    } */

            int count=0;
            short[] bucket = new short[1001];
            // bucket is an array in which all the elements of nums1 are assigned a value 2
            for(int i=0;i<nums1.length;i++){
                bucket[nums1[i]] = 2;
            }

            for(int i=0;i<nums2.length;i++){
                if(bucket[nums2[i]]==2){//Intersection el
                    bucket[nums2[i]] = 1;
                    count += 1;// counting the no of intersecting elements
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
        }

        public static void main(String[] args) {
            int [] arr1 = {1,2,2,3,6};
            int[] arr2 = {1,25,2,3};
            System.out.println(Arrays.toString(intersection(arr2,arr1)));
        }
}
