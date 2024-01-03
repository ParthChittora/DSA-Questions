import java.util.Arrays;

public class MaxPopulationYr {
    // q : https://leetcode.com/problems/maximum-population-year/description/
    // GOOD SOLN with explanation above : https://leetcode.com/problems/maximum-population-year/solutions/1198978/java-o-n-solution-with-explanation-range-addition/comments/933582
    public static int maximumPopulation(int[][] logs) {
        int[] year = new int[101];
        for(int[] log : logs){
            year[log[0]-1950]++;//taking 1950 as 0 index
            year[log[1]-1950]--;
        }
        int maxFreq = year[0];
        int maxFreqYear = 0;
        for(int i = 1 ; i< year.length ; i++){
            year[i] += year[i-1];
            if(year[i]> maxFreq){
                maxFreq= year[i];
                maxFreqYear = i ;
            }
        }
        System.out.println(Arrays.toString(year));
        return maxFreqYear+1950;
    }

    public static void main(String[] args) {
        int[][] sample = {
                {1950,1961},
                {1960,1971},
                {1970,1981}
        };
        System.out.println(maximumPopulation(sample));
    }
}
