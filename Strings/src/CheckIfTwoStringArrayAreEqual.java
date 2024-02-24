public class CheckIfTwoStringArrayAreEqual {
    public static boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        StringBuilder st1 =new StringBuilder();
        StringBuilder st2=new StringBuilder() ;
        for(String el : word1){
            st1.append(el);
        }
        for(String el : word2){
            st2.append(el);
        }
        return (st1.toString()).equals(st2.toString());

    }

    public static void main(String[] args) {
        String[] ip1 = {"ab", "c"};
        String[] ip2 = {"a", "bc"};
        System.out.println(arrayStringsAreEqual(ip1,ip2));
    }
}
