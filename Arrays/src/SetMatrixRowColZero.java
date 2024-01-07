import java.util.Arrays;

public class SetMatrixRowColZero {
//    https://leetcode.com/problems/set-matrix-zeroes/description/
    public static void setRowZero(int[][] matrix , int row){
        Arrays.fill(matrix[row], 0);
    }
    public static void setColZero(int[][] matrix , int col){
        for(int i = 0 ; i<matrix.length;i++){
            matrix[i][col]=0;
        }
    }
    public static void setZeroes(int[][] matrix) {
        boolean fr = false,fc = false; // Used to check whether the top row el is 0 or not
        for(int i = 0; i<matrix.length;i++){
            for(int j =0 ; j< matrix[0].length;j++){
                if(matrix[i][j]==0){
                    if(i == 0) fr = true;
                    if(j == 0) fc = true;
                    matrix[0][j]=0;//col
                    matrix[i][0]=0;//row
                }
            }
        }
        for(int i = 1 ; i<matrix.length;i++){
            if(matrix[i][0]==0){
                setRowZero(matrix,i);
            }
        }
        for(int i = 1 ; i<matrix[0].length ; i++){
            if(matrix[0][i]==0){
                setColZero(matrix,i);
            }
        }
        if(fr) {
            Arrays.fill(matrix[0], 0);
        }
        if(fc) {
            for(int i = 0; i < matrix.length; i++) {
                matrix[i][0] = 0;
            }
        }
    }

    public static void main(String[] args) {
        int[][] sample = {
                {0,1,2,0},
                {3,4,5,2},
                {1,3,1,5}
        };
        setZeroes(sample);
    }
}
