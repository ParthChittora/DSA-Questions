public class ValidPalindrome {
    public static boolean isPalindrome(String s) {
        String helper = s.toLowerCase();
        char[]arr =helper.toCharArray();
        StringBuilder ans = new StringBuilder();
        for(char el : arr){
            if(el>='a'&&el<='z'){
                ans.append(el);
            }
        }
        System.out.println(ans);
        return false;
    }

    public static void main(String[] args) {
        String a = "race a car";
        System.out.println(isPalindrome(a));
    }
}
