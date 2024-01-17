public class SearchA2dMatrix {
    // https://leetcode.com/problems/search-a-2d-matrix/description/
    public static boolean searchMatrix(int[][] matrix, int target) {
        int m=matrix.length;
        int n=matrix[0].length;

        // binnary implementation
        int low=0,high=m*n-1;// high = 8 (for 3*3 matrix)
        while(low<=high) {
            int midIdx,midEle,rowIdx,colIdx;
            midIdx=low+(high-low)/2;
            rowIdx=midIdx/n;
            colIdx=midIdx%n;
            midEle=matrix[rowIdx][colIdx];
            if(midEle==target)
                return true;
            else if(midEle<target)
                low=midIdx+1;
            else
                high=midIdx-1;
        }
        return false;
    }

    public static void main(String[] args) {
        int[][] arr ={
                {1,3,5,7},
                {10,11,16,20},
                {23,30,34,60}
        };
        int target = 30 ;
        System.out.println(searchMatrix(arr ,target));
    }
}
