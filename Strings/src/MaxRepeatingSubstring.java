public class MaxRepeatingSubstring {
    public static int maxRepeating(String sequence, String word) {
        StringBuilder str = new StringBuilder();
        int count = 0;
        str.append(word);
        while(sequence.contains(str)) {
            count++;
            str.append(word);
        }
        return count;
    }

    public static void main(String[] args) {
        String seq =  "ababc", word = "ac";
        System.out.println(maxRepeating(seq,word));
    }
}
