public class FindSmallestLetterGreaterThanTarget {
//    https://leetcode.com/problems/find-smallest-letter-greater-than-target/description/
 public static char nextGreatestLetter(char[] letters, char target) {
     int start = 0;
     int end = letters.length - 1;
     if (target >= letters[end])
         return letters[0];
     else {
         while (start <= end) {
             int mid = start + (end - start) / 2;
             if (target < letters[mid])
                 end = mid - 1;
             else start = mid + 1;
         }
     }
     return letters[start];
     // One more way to do is by returning letters[start%letters.length] by this method u can remove the first if else conditions
 }

    public static void main(String[] args) {
        char[] letterSample = {'x','x','y','y'};
        char target = 'z';
        System.out.println(nextGreatestLetter(letterSample,target));
    }
}
