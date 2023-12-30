public class TargetArrayObtainedByRotation {
    public static boolean checkEquality(int[][] m ,int[][]n){
        for(int i = 0 ; i<m.length;i++){
            for(int j = 0 ; j<m[i].length;j++){
                if(m[i][j]!=n[i][j])
                    return false;
            }
        }
        return true;
    }
    public static int[][] rotateArrayBy90(int[][] arr){
        int[][] ans = new int[arr.length][arr.length];
        for(int i = 0 ; i<arr.length;i++){
            for(int j=0 ; j<arr.length;j++){
                ans[j][arr.length-i-1]=arr[i][j];
            }
        }
        for (int[] a: ans
             ) {
            for (int el: a
                 ) {
                System.out.print(el+ " ");
            }
            System.out.println();

        }
        return ans;
    }
    public static boolean findRotation(int[][] mat, int[][] target) {
        int[][] finalAns = new int[mat.length][mat.length];
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j <mat.length ; j++) {
                finalAns[i][j]= mat[i][j];
            }
        }
        for(int rotateCount = 0 ; rotateCount<=4;rotateCount++){
            finalAns = rotateArrayBy90(finalAns);
            boolean check = checkEquality(finalAns,mat);
            if(check == true)
                return check;
        }
        return false;
    }

    public static void main(String[] args) {
        int [][] mat = {
                {1}
        };

        int [][] target = {
                {0}
        };

        System.out.println(findRotation(mat ,target));
    }
}
