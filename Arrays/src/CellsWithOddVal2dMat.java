public class CellsWithOddVal2dMat {
    public static void rowIncrement (int row , int[][]arr){
        for(int i = 0 ; i< arr[row].length;i++){
            arr[row][i]++;
        }
    }
    public static void colIncrement (int col , int[][]arr){
        for(int i = 0 ; i< arr.length;i++){
            arr[i][col]++;
        }
    }
    public static int oddCells(int m, int n, int[][] indices) {
        int count = 0;
        int[][] resultMatrix  = new int[m][n];
        for (int[] index : indices) {
            int rowValue = index[0];
            rowIncrement(rowValue, resultMatrix);
            int colValue = index[1];
            colIncrement(colValue, resultMatrix);
        }
        for(int i = 0; i<m;i++){
            for(int j = 0 ;j<n;j++){
                if(resultMatrix[i][j]%2!=0)
                    count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int[][] indices = {{0,1},{1,1}};
        int m =2 ;
        int n=3;
        System.out.println(oddCells(m,n,indices));
    }
}
