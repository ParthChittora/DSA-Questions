public class ValidSquare {
    // https://leetcode.com/problems/valid-perfect-square/description/
    public static boolean isPerfectSquare(int num) {
        int start = 1;
        int end = num;
        while(start<=end){
            // If we take "int mid" then the decimals will be rounded off to integer which will give wrong answers
            double mid = (start + (end-start)/2);

            if(mid==num/mid)
                return true;

            else if(mid<num/mid)
                start = (int)mid+1;
            else end = (int)mid-1;
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(isPerfectSquare(144));
    }
}
