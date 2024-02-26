public class ReverseWordsInAStringIII {
    public static String reverseString(String s){
        StringBuilder st = new StringBuilder();
        st.append(s);
        return st.reverse().toString();
    }
    public static String reverseWords(String s) {
        String[] arr = s.split(" ");
        StringBuilder ans = new StringBuilder();
        for (int i = 0; i < arr.length-1; i++) {
            ans.append(reverseString(arr[i])+" ");
        }
        ans.append(reverseString(arr[arr.length-1]));
        return ans.toString();
    }

    public static void main(String[] args) {
        String a = "Let's take LeetCode contest";
        System.out.println(reverseWords(a));
    }
}
