public class DetermineIfStringHalvesAreEqual {
    public static boolean halvesAreAlike(String s) {
        int cnt1=countOfVowels(s,0,s.length()/2);
        int cnt2=countOfVowels(s,s.length()/2,s.length());
        return cnt1==cnt2;
    }
    public static int countOfVowels(String s,int start,int end)
    {
        int count=0;
        for(int i=start;i<end;i++)
        {
            char c=s.charAt(i);
            if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'||c=='A'||c=='E'||c=='I'||c=='O'||c=='U')
            {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        String ip = "book";
        System.out.println(halvesAreAlike(ip));
    }
}
