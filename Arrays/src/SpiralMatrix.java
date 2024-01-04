import java.util.*;
public class SpiralMatrix {
    // https://leetcode.com/problems/spiral-matrix/description/
    // https://www.youtube.com/watch?v=3Zv-s9UUrFM
    public static List<Integer> spiralOrder(int[][] arr) {

        List<Integer> list = new ArrayList<>();
        int n = arr.length;
        int m = arr[0].length;
        int left = 0, right = m - 1;
        int top = 0, bottom = n - 1;
        while (top <= bottom && left <= right) {
            // right
            for (int i = left; i <= right; i++) {
                list.add(arr[top][i]);
            }
            top++;
            // bottom
            for (int i = top; i <= bottom; i++) {
                list.add(arr[i][right]);
            }
            right--;
            //left
            if (top <= bottom) {
                for (int i = right; i >= left; i--) {
                    list.add(arr[bottom][i]);
                }
                bottom--;
            }

            // top
            if (left <= right) {
                for (int i = bottom; i >= top; i--) {
                    list.add(arr[i][left]);
                }
                left++;
            }
        }
        return list;
    }



    public static void main(String[] args) {
        int[][] sample = {
                {1,2,3,4 },
                {5,6,7,8},
                {9,10,11,12},
                {13,14,15,16}
        };
        System.out.println(spiralOrder(sample));
    }
}
