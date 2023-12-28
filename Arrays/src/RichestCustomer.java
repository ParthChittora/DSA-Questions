// https://leetcode.com/problems/richest-customer-wealth/description/
public class RichestCustomer {
    public static int maximumWealth(int[][] accounts) {
        int maxSum =0;
        for(int[] el : accounts){
            int sum =0;
            for(int el2 : el){
                sum+=el2;
            }
            if(sum>maxSum) maxSum = sum;
        }
        return maxSum;
    }
    public static void main(String[] args) {
        int[][] sample = {{1,2,3},{3,2,9}};
        System.out.println(maximumWealth(sample));
    }
}
