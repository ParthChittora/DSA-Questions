
public class ThirdMaxNumber {
    // public static int thirdMax(int[] nums) {
    //     Set<Integer> h1 = new HashSet<>();
    //     for (int num : nums) {
    //         h1.add(num);
    //     }
    //     int[] ans = new int[h1.size()];
    //     int x =0;
    //     for (int i : h1) {
    //         ans[x] = i;
    //         x++;
    //     }
    //     Arrays.sort(ans);
    //     if(ans.length<3){
    //         return ans[ans.length-1];
    //     }
    //     else{
    //         return ans[ans.length-3];
    //     }
    // }

    public static int thirdMax(int[] nums) {

        long firstMax=Long.MIN_VALUE,secondMax=Long.MIN_VALUE,thirdMax=Long.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            if(firstMax<nums[i]){
                firstMax=nums[i];//3
            }
        } for(int i=0;i<nums.length;i++){
            if(nums[i]!=firstMax && secondMax<nums[i]){
                secondMax=nums[i];
            }
        }
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=firstMax && thirdMax < nums[i] && nums[i]!=secondMax){
                thirdMax=nums[i];
            }
        }
        if (thirdMax != Long.MIN_VALUE)
        {
            return (int)thirdMax;
        }
        return (int)firstMax;

    }



    public static void main(String[] args) {
        int[] arr = {1,2,3,2};
        System.out.println(thirdMax(arr));
    }

}
