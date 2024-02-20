import java.util.Arrays;
import java.util.HashMap;

public class RankTransformOfAnArray {
    public static int[] arrayRankTransform(int[] arr) {
        int[] newArr = arr.clone();
        HashMap<Integer,Integer> map = new HashMap<>();
        int rank = 0;
        Arrays.sort(newArr);
        for (int i = 0; i <newArr.length ; i++) {
            if(!map.containsKey(newArr[i]))
                map.put(newArr[i],++rank);
        }
        int[] result = new int[newArr.length];
        for (int i = 0; i < arr.length; i++) {
            result[i] = map.get(arr[i]);
        }
        return result;
    }

    public static void main(String[] args) {
        int [] arr = {40,10,20,30};
        System.out.println(Arrays.toString(arrayRankTransform(arr)));
    }
}
