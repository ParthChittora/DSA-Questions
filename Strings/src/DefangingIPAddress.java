public class DefangingIPAddress {
    public static String defangIPaddr(String address) {
        StringBuilder ans = new StringBuilder();
        for(char c : address.toCharArray()){
            if(c=='.'){
                ans.append("[.]");
            }
            else ans.append(c);
        }
        return ans.toString();
    }

    public static void main(String[] args) {
        String ip = "1.1.1.1";
        System.out.println(defangIPaddr(ip));
    }
}
