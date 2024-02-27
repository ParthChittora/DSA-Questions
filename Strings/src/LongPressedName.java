public class LongPressedName {
    public static boolean isLongPressedName(String name, String typed) {
        for (int i = 0; i <typed.length() ; i++) {
            if(typed.charAt(i)==typed.charAt(i+1)){
                return typed.startsWith(name,i);
            }
        }
        return false;
    }
    public static void main(String[] args) {
        String a = "alex";
        String b = "aalex";
        System.out.println(isLongPressedName(a,b));
    }
}
