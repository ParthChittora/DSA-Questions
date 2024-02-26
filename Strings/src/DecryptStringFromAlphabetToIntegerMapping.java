
public class DecryptStringFromAlphabetToIntegerMapping {
    public static String freqAlphabets(String s) {
        // It can be optimised
        StringBuilder fn = new StringBuilder() ;
        for (int i = 0; i <s.length() ; i++) {
            if(s.charAt(i)=='#'){
                fn.delete((fn.length())-2,fn.length());
                String ans = s.substring(i-2,i);
                int dig = Integer.parseInt(ans);
                fn.append((char)(96+dig));

            }
            else {
                fn.append((char) (96 + Character.getNumericValue(s.charAt(i))));
            }
        }
        return fn.toString();
    }

    public static void main(String[] args) {
        String ip = "10#11#12";
        System.out.println(freqAlphabets(ip));
    }
}

