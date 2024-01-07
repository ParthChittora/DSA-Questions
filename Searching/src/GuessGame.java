public class GuessGame {
    // https://leetcode.com/problems/guess-number-higher-or-lower/description/

//    Only soln to be submitted on lc as we dont have api
/**
     * Forward declaration of guess API.
     * @param  num   your guess
     * @return 	     -1 if num is higher than the picked number
     *			      1 if num is lower than the picked number
     *               otherwise return 0
     * int guess(int num);
     */

    public class Solution extends GuessGame {
        public int guessNumber(int n) {
            int start =1 ;
            int end = n;
            while(start<= end){
                int mid = start+(end- start)/2;
                int checkGuess = guess(mid);
                if(checkGuess==0){
                    return mid;
                }
                else if(checkGuess==1){
                    start =mid+1;
                }
                else end=mid-1;
            }
            return -1;
        }
    }
}
