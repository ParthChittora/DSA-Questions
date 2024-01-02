// https://leetcode.com/problems/remove-duplicates-from-sorted-array/description/
// They don't really want you to remove the duplicates.
// They want you to sort the uniques at the front, then return the length of the sorted part.
// Then, behind the scenes, they slice the array at the length you give them and the result of that is what they check.
public class RemoveDuplicatesFromArray {
    public static int removeDuplicates(int[] arr) {
        int i=0;
        for(int j=1;j<arr.length;j++){
            if(arr[i]!=arr[j]){
                i++;
                arr[i]=arr[j];
            }
        }
        return i+1;
    }

    public static void main(String[] args) {
        int[] arr = {0,1,2,2,3,3,3,3,5};
        System.out.println(removeDuplicates(arr));
    }
}
