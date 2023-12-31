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
        return ans;
    }
    public static boolean findRotation(int[][] mat, int[][] target) {

        for(int rotateCount = 0 ; rotateCount<4;rotateCount++){
            if(checkEquality(mat, target)){
                return true;
            }
            mat = rotateArrayBy90(mat);
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
