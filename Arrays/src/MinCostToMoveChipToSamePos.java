public class MinCostToMoveChipToSamePos {
    //https://leetcode.com/problems/minimum-cost-to-move-chips-to-the-same-position/description/
    public static int minCostToMoveChips(int[] position) {
        // All coins at even are placed at 0 index with cost 0
        // similarly for odd the coins are place at index 1 with cost 0
        // and then the min amount of coins is returned
        int countEven = 0;
        int countOdd =0 ;
        for(int i = 0 ; i< position.length ; i++){
            if(position[i]%2 == 0 ){
                countEven++;
                // position[i] =0;
            }
            else{
                countOdd++;
                // position[i]= 1 ;
            }
        }
        return Math.min(countEven,countOdd);
    }

    public static void main(String[] args) {
        int[] position = {2,2,2,3,3};
        System.out.println(minCostToMoveChips(position));
    }
}
