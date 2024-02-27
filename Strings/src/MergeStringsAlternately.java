public class MergeStringsAlternately {
    public static String mergeAlternately(String word1, String word2) {
        int index  = 0;
        int len1 = word1.length();
        int len2 = word2.length();
        StringBuilder sb = new StringBuilder();
        while(index < len1 && index < len2) {
            sb.append(word1.charAt(index));
            sb.append(word2.charAt(index));
            index++;
        }

        if(len1 > len2) {
            sb.append(word1.substring(index));
        }
        else {
            sb.append(word2.substring(index));
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        String ip1 ="abc";
        String ip2 ="pqrstuv";
        System.out.println(mergeAlternately(ip1,ip2));
    }
}
