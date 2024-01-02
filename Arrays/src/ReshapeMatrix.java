// https://leetcode.com/problems/reshape-the-matrix/description/
public class ReshapeMatrix {
    // Brute force approach
    public static int[][] matrixReshape(int[][] mat, int r, int c) {
        if(r*c!=mat.length*mat[0].length || (r==mat.length && c==mat[0].length)){
            return mat;
        }
        int [][] finalAns = new int[r][c];
        int row =0;
        int col = 0;
        for(int j =0  ; j<mat.length; j++){
            for(int k= 0 ; k<mat[0].length ;k++){
                finalAns[row][col]=mat[j][k];
                col++;
                if(col==c){
                    row++;
                    col =0;
                }
            }
        }
        return finalAns;
    }
    // More optimised solution in single loop time complexity o(n)
//    public static int[][] matrixReshape(int[][] mat, int r, int c) {
//        int row = mat.length;
//        int colum = mat[0].length;
//        int[][] matrix = new int[r][c];
//        if(row == r  &&  colum == c){
//            return mat;
//        }
//        if(row*colum != r*c){
//            return mat;
//        }
//        for(int i=0; i<row*colum; i++){
//            matrix[i/c][i%c] = mat[i/colum][i%colum];
//        }
//        return matrix;
//    }
    public static void main(String[] args) {
        int[][] arr = {
            {1,2},
            {3,4}
        };
        int[][] ans = matrixReshape(arr,1,4);
        for (int[] a:ans
             ) {
            for(int el : a){
                System.out.print(el+" ");
            }
            System.out.println();
        }
    }
}
