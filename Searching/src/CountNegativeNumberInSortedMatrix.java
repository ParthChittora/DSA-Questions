public class CountNegativeNumberInSortedMatrix {
//    https://leetcode.com/problems/count-negative-numbers-in-a-sorted-matrix/description/
    public static int countNegatives(int[][] grid) {
        int r = 0 ;
        int c = grid[0].length-1;
        int count = 0 ;
        while(r<grid.length&&c>=0){
            if(grid[r][c]<0){
                count+=grid.length-r;
                c--;
            }
            else r++;
        }
        return count;
    }

    public static void main(String[] args) {
        int[][] arr = {{4,3,2,-1},{3,2,1,-1},{1,1,-1,-2},{-1,-1,-2,-3}};
        System.out.println(countNegatives(arr));
    }
}
