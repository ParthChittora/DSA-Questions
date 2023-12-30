import java.util.*;
public class AddToArrayFormOfInteger {
    public static List<Integer> addToArrayForm(int[] num, int k) {
        List<Integer> list = new ArrayList<>();
        int carry =k ;
        for(int i = num.length-1 ;i>=0;i--){
            int sum = 0 ;
            int digK = k%10;
            sum = num[i]+carry;
            if(sum>9){
               list.add(0,sum%10);
                carry = sum/10;
                continue;
            }
            list.add(0,sum);
            carry=carry/10;
        }
        if (carry!=0){
            list.add(0,carry);
        }
        return list;
    }

    public static void main(String[] args) {
        int[] num ={9,9,9,9,9,9,9,9,9,9};
        int k =1;
        System.out.println(addToArrayForm(num,k));
    }
}
