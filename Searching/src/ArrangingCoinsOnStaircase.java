public class ArrangingCoinsOnStaircase {
    // https://leetcode.com/problems/arranging-coins/description/

    // public int arrangeCoins(int n) {
    //       int i = 1;
    //     while(n > 0)
    //     {
    //         i++;
    //         n = n-i;
    //     }

    //     return i-1;
    // }

    public static int arrangeCoins(int n) {
        int start = 0;
        int end = n;
        while(start<=end){
            long mid = start+(end-start)/2;
            // sum till index mid
            long currentTillMidSum = mid*(mid+1)/2;
            // if sum equals to sum till mid index then return mid
            if(currentTillMidSum==n)
                return (int)mid;
                // else if sum < n the index of mid should increase so we are checking after previous mid
            else if (currentTillMidSum<n){
                start = (int)mid+1;
            }
            else end = (int)mid -1;
        }
        return end;
    }

    public static void main(String[] args) {
        System.out.println(arrangeCoins(10));
    }
}
