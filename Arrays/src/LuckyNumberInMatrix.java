import java.util.*;
public class LuckyNumberInMatrix {
    public static int minElRow(int[][]arr , int row ){
        int min = Integer.MAX_VALUE ;
        int minIndex =-1;
        for (int j=0;j<arr[0].length;j++) {
            if(arr[row][j]<min){
                min = arr[row][j];
                minIndex = j;
            }
        }
        return minIndex;
    }
    public static int maxElCol(int[][]arr , int col ){
        int max = Integer.MIN_VALUE ;
        int maxIndex = -1;
        for (int j=0;j<arr.length;j++) {
            if(arr[j][col]>max){
                max = arr[j][col];
                maxIndex= j;
            }
        }
        return maxIndex;
    }
    public static List<Integer> luckyNumbers (int[][] matrix) {
        List<Integer> list = new ArrayList<>();
        for(int i = 0 ; i< matrix.length; i++){
            int rowMinIndex = minElRow(matrix, i);
            int colMaxIndex = maxElCol(matrix ,rowMinIndex);
            if(i==colMaxIndex){
                list.add(matrix[i][rowMinIndex]);
            }
        }
        return list;

    }

    public static void main(String[] args) {
        int [][] mat = {
                {3,7,8},
                {9,11,13},
                {15,16,17}
        };
        System.out.println(luckyNumbers(mat));
    }
}
