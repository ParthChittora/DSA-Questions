public class SquareRoot {
    public static int mySqrt(int x) {
        if (x == 0) {
            return 0;
        }
        int start = 1, end = x;
        while (start <= end) {
            int mid = start + (end - start) / 2;
// if mid*mid<=x then it can be a possible ans but if mid+1*mid+1<x then mid+1 would be the ans but if mid+1*mid+1 is greater than x then mid is the final ans
            if (mid <= x / mid && (mid + 1) > x / (mid + 1)) {
                return mid;
            } else if (mid > x / mid) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return 0;
    }
    public static void main(String[] args) {
        int sample = 144;
        System.out.println(mySqrt(sample));
    }
}
