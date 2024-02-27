public class ValidPalindrome {
    public static boolean isPalindrome(String s) {
        s = s.toLowerCase();
        int left = 0, right = s.length() - 1;

        while(left < right) {
            if(!isValid(s.charAt(left))) {
                left++;
                continue;
            }

            if(!isValid(s.charAt(right))) {
                right--;
                continue;
            }

            if(s.charAt(left) != s.charAt(right))
                return false;

            left++;
            right--;
        }

        return true;
    }

    public static boolean isValid(char c) {
        return (c >= 'a' && c <='z') || (c >= '0' && c <= '9');
    }

//    public  boolean isPalindrome(String s) {
//         if (s.isEmpty()) {
//             return true;
//         }

//         StringBuilder st = new StringBuilder();
//         for (int i = 0; i < s.length(); i++) {
//             if (s.charAt(i) != ' '){
//                if (Character.isLetterOrDigit(s.charAt(i))) {
//                 st.append(Character.toLowerCase(s.charAt(i)));
//             }
//             }
//         }
//         return checkPallindrome(st.toString());
//     }

// public  boolean checkPallindrome(String s){
//     if(s.length()==1){
//         return true;
//     }
//         int start = 0;
//         int last = s.length() - 1;
//         while(start <= last) {
//             if(s.charAt(start)!=s.charAt(last)){
//                 return false;
//             }
//             start++;
//             last--;
//         }

    //         return true;
//     }
    public static void main(String[] args) {
        String ip = "A man, a plan, a canal: Panama";
        System.out.println(isPalindrome(ip));
    }
}
