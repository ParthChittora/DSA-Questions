import java.util.HashMap;

public class ShuffleString {
    public static String restoreString(String s, int[] indices) {
//        StringBuilder ans=new StringBuilder() ;
//        HashMap<Integer,Character> map = new HashMap<>();
//        for (int i = 0; i < indices.length ; i++) {
//            map.put(indices[i],s.charAt(i));
//        }
//        for (int i = 0; i < indices.length; i++) {
//            ans.append(map.get(i));
//        }
//       return ans.toString();

        char[] arr = new char[s.length()];
        for (int i = 0; i < s.length(); i++) {
            arr[indices[i]] = s.charAt(i);
        }
        return new String(arr);
    }

    public static void main(String[] args) {
        String ip = "codeleet";
        int[] indices = {4,5,6,7,0,2,1,3};
        System.out.println(restoreString(ip,indices));
    }
}
