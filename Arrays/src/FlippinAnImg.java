import java.util.Arrays;

public class FlippinAnImg {
    // https://leetcode.com/problems/flipping-an-image/
    public static void swap(int[] arr , int a , int b){
        int temp = arr[a];
        arr[a]=arr[b];
        arr[b]=temp;
    }
    public static int[][] flipAndInvertImage(int[][] image) {
        for(int[] arr : image){
            for(int j = 0 ; j<image.length/2;j++){
                swap(arr,j,image.length-j-1);
            }
            for(int j = 0 ; j< image.length ; j++){
                // here ^ is xor operator
                arr[j]^= 1 ;
            }
        }
        return image;
    }

    public static void main(String[] args) {
        int[][] sample ={
                {1,1,0},
                {1,0,1},
                {0,0,0}
        };
        flipAndInvertImage(sample);
        for (int[]arr :sample) {
            for (int el :arr) {
                System.out.print(el + " ,");
            }
            System.out.println();
        };
    }
}
