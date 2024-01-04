public class SprialMatrixII {
    // https://leetcode.com/problems/spiral-matrix-ii/description/
    public static int[][] generateMatrix(int n) {
        int[][] arr = new int[n][n];
        int left = 0, right = n - 1;
        int top = 0, bottom = n - 1;
        int count = 1;
        while (top <= bottom && left <= right) {
            // right
            for (int i = left; i <= right; i++) {
                arr[top][i] = count;
                count++;
            }
            top++;
            // bottom
            for (int i = top; i <= bottom; i++) {
                arr[i][right] = count;
                count++;
            }
            right--;
            //left
            if (top <= bottom) {
                for (int i = right; i >= left; i--) {
                    arr[bottom][i] = count;
                    count++;
                }
                bottom--;
            }

            // top
            if (left <= right) {
                for (int i = bottom; i >= top; i--) {
                    arr[i][left] = count;
                    count++;
                }
                left++;
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        int[][] arr = generateMatrix(5);
        for(int[] a : arr){
            for (int el:
                 a) {
                System.out.print(el+" ");
            }
            System.out.println();
        }
    }
}
