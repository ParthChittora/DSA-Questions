public class TransposeMatrix {
    public static int[][] transpose(int[][] matrix) {
        int [][] arr = new int[matrix[0].length][matrix.length];
        for(int i=0;i<matrix.length;i++){
            for(int j= 0 ;j<matrix[i].length;j++){
                arr[j][i] = matrix[i][j];
            }
        } return arr;
    }
    public static void main(String[] args) {
        int [][] sample = {
                {1,2,3},{4,5,6},{7,8,9}
        };
       int[][] ans= transpose(sample);
        for (int[] a:ans
             ) {
            for (int el: a
                 ) {
                System.out.print(el+" ");
            }
            System.out.println();
        }
    }
}
