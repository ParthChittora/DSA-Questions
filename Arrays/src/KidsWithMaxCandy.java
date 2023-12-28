// https://leetcode.com/problems/kids-with-the-greatest-number-of-candies/
import java.util.*;
public class KidsWithMaxCandy {
    public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int maxCandy = 0 ;
        for(int candy: candies) {
            if(candy > maxCandy) {
                maxCandy = candy;
            }
        }
        List<Boolean> result = new ArrayList<>();
        for(int currentCandy : candies) {
            if(currentCandy + extraCandies >= maxCandy) {
                result.add(true);
            }
            else {
                result.add(false);
            }
        }
        return result;
    }
    public static void main(String[] args) {
        int[] candies ={2,3,5,1,3} ;
        int extra = 3;
        System.out.println(kidsWithCandies(candies , extra));
    }
}
