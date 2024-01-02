import java.util.*;
public class AddToArrayFormOfInteger {

        public static List<Integer> addToArrayForm(int[] num, int K) {
            List<Integer> res = new LinkedList<>();
            for (int i = num.length - 1; i >= 0; --i) {
                res.add(0, (num[i] + K) % 10);
                K = (num[i] + K) / 10;
            }
            while (K > 0) {
                res.add(0, K % 10);
                K /= 10;
            }
            return res;
        }


    public static void main(String[] args) {
        int[] num ={9,9,9,9,9,9,9,9,9,9};
        int k =1;
        System.out.println(addToArrayForm(num,k));
    }
}
