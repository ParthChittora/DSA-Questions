public class FirstOccurrence {
    public  static int strStr(String haystack, String needle) {
            if (haystack.equals(needle)) {
                return 0;
            }
            for (int i = 0; i <= haystack.length() - needle.length(); i++) {
                if (haystack.startsWith(needle, i))
                    return i;
            }
            return -1;
        }


    public static void main(String[] args) {
        String a = "abc";
        String b = "c";
        System.out.println(strStr(a,b));
    }
}
