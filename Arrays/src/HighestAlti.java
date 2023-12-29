public class HighestAlti {
    // https://leetcode.com/problems/find-the-highest-altitude
    public static int largestAltitude(int[] gain) {
        int currentHeight = 0;
        int max = 0;
        for(int el : gain){
            currentHeight+=el;
            if(currentHeight>max)
                max=currentHeight;
            //or we can make an array of altitude and sort it and return the length-1
            //element of the array
        }
        return max;
    }

    public static void main(String[] args) {
        int[] gain = {-5,1,5,0,-7};
        System.out.println(largestAltitude(gain));
    }
}
