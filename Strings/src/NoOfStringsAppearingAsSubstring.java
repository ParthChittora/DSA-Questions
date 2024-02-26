public class NoOfStringsAppearingAsSubstring {
    public static int numOfStrings(String[] patterns, String word) {
        int count = 0 ;
        for (String el:
             patterns) {
            if(word.contains(el)){
                count ++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        String []pattern = {"a","abc","bc","d"};
        String word = "abc";
        System.out.println(numOfStrings(pattern,word));
    }
}
