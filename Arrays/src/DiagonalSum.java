// https://leetcode.com/problems/matrix-diagonal-sum/description/
public class DiagonalSum {
    public static int diagonalSum(int[][] mat) {
        int sum=0;
        for(int i = 0 ; i<mat.length;i++){
            sum+=mat[i][i];//primary diagonal
            sum+=mat[i][mat.length-i-1];//secondary diagonal
        }
        // for odd the middle element is being repeated ,so it should be deducted from final sum
        if(mat.length%2!=0)
            sum=sum-mat[mat.length/2][mat.length/2];
        return sum;
    }

    public static void main(String[] args) {
        int[][] mat = {
                {1,1,1,1},
                {1,1,1,1},
                {1,1,1,1},
                {1,1,1,1}
        };
        System.out.println(diagonalSum(mat));
    }
}
