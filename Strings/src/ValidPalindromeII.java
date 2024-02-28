public class ValidPalindromeII {
    // Brute Force

    //    public static  boolean validPalindrome(String s) {
    //        if(checkPallindrome(s)){
    //            return true;
    //        }
    //     char[] arr = s.toCharArray();
    //     int l = s.length();
    //     StringBuilder ans = new StringBuilder();
    //     int index1 =0 ;
    //     int index2 =0;

    //     for (int i = 0; i <=l/2; i++) {
    //         if(arr[i]!=arr[l-i-1]){
    //             index1=i;
    //             index2 = l-i-1;
    //             break;
    //         }
    //     }
    //     for (int i = 0; i <l ; i++) {
    //         if(i!=index1)
    //             ans.append(s.charAt(i));
    //     }
    //     if (checkPallindrome(ans.toString())){
    //         return true;
    //     }
    //     else{
    //         StringBuilder ans1 = new StringBuilder();
    //     for (int i = 0; i <l ; i++) {
    //         if(i!=index2)
    //             ans1.append(s.charAt(i));
    //     }
    //     if (checkPallindrome(ans1.toString())){
    //         return true;
    //     }
    //     }

    //     return false;
    // }
    // public static boolean checkPallindrome(String s){
    //  if(s.length()==1){
    //      return true;
    //  }
    //      int start = 0;
    //      int last = s.length() - 1;
    //      while(start <= last) {
    //          if(s.charAt(start)!=s.charAt(last)){
    //              return false;
    //          }
    //          start++;
    //          last--;
    //      }

    //      return true;
    //  }

    public static boolean validPalindrome(String s) {
        int left = 0;
        int right = s.length() - 1;

        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) {
                // Try skipping the character on the left
                if (isPalindrome(s, left + 1, right)) {
                    return true;
                }
                // Try skipping the character on the right
                if (isPalindrome(s, left, right - 1)) {
                    return true;
                }
                // If neither case is a palindrome, return false
                return false;
            }
            left++;
            right--;
        }

        return true;
    }

    private static boolean isPalindrome(String s, int start, int end) {
        while (start < end) {
            if (s.charAt(start) != s.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }

    public static void main(String[] args) {
        String s = "eedede";
        System.out.println(validPalindrome(s));
    }
}
