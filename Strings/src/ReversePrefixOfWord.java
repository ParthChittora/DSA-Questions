public class ReversePrefixOfWord {
    public static String reversePrefix(String word, char ch) {
        StringBuilder ans = new StringBuilder();

        int count = 0;
        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) == ch) {
                ans.append(word, 0, i + 1).reverse();
                count = i + 1;
                break;
            }
        }
        ans.append(word.substring(count));
        return ans.toString();

    }

    public static void main(String[] args) {
        String word = "xyxzxe";
        char ch = 'z';
        System.out.println(reversePrefix(word, ch));
    }
}
