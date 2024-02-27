public class CheckIfBinaryStringSegmentsOfOne {
    public static boolean checkOnesSegment(String s) {
        for(int i =0 ; i<s.length()-1;i++){
            if(s.charAt(i)=='0'&&s.charAt(i+1)=='1'){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String ip = "1001";
        System.out.println(checkOnesSegment(ip));
    }
}
