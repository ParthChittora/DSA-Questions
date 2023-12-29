public class FindNoOfEvenDigitNumb {
//    public static int checkDig(int n){
//        int count =0;
//        while(n>0){int dig = n%10;
//            n=n/10;
//            count++;}
//        return count;
//    }
//    public static int findNumbers(int[] nums) {
//        int count = 0;
//        for(int el : nums){
//            if(checkDig(el)%2==0)
//                count++;
//        }
//        return count;
//    }
public static int findNumbers(int[] nums) {
    //This solution reduces runtime but the logic is quite bad
// A good logic solution that would work in certainly every condition is the solution on
    int x = 0;
    for(int y : nums)
        if((999 < y && y < 10000) || (9 < y && y < 100) || (99999 < y && y < 1000000))
            x++;
    return x;
}

    public static void main(String[] args) {
        int [] sample = {12,345,2,6,7896 };
        System.out.println(findNumbers(sample));
    }
}
