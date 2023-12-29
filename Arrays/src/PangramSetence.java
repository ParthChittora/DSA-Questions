// https://leetcode.com/problems/check-if-the-sentence-is-pangram/
public class PangramSetence {
    public static boolean checkIfPangram(String sentence) {

        if(sentence.length()<26){
            return false;
        }
        else{
            for(char ch='a'; ch<='z';ch++){
                if(sentence.indexOf(ch)<0){
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String str = "thequickbrownfoxjumpsoverthelazydog";
        System.out.println(checkIfPangram(str));
    }
}
