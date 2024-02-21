import java.util.Arrays;

public class AvgSalaryExcludingMinAndMaxSalary {
    public static double average(int[] salary) {
        Arrays.sort(salary);
        int sum =0 ;
        for(int i = 1 ; i<salary.length -1;i++){
            sum += salary[i];
        }
        return (double)sum/(salary.length-2);
    }

    public static void main(String[] args) {
        int [] arr = {1000,2000,4000,3000};
        System.out.println(average(arr));
    }
}
