import java.util.Arrays;

public class AssignCookies {
    public static int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int p1 = g.length - 1;
        int p2 = s.length - 1;
        int count = 0;
        while (p1 >= 0 && p2 >= 0) {
            if (s[p2] >= g[p1]) {
                count++;
                p2--;
            }
            p1--;
        }
        return count;
    }

    public static void main(String[] args) {
        int[] g = {1,2,3};
        int[] s = {1,1};
        System.out.println(findContentChildren(g, s));
    }
}
