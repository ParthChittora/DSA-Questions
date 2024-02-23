public class GoalParserInterpretion {
    public static String interpret(String command) {
        StringBuilder ans = new StringBuilder();
        for (int i = 0; i <command.length() ; i++) {
            if (command.charAt(i) == 'G') {
                ans.append('G');
            }
            else if (command.charAt(i)=='('&&command.charAt(i+1)==')'){
                ans.append('o');
                i++;
            }
            else{
                ans.append("al");
                i+=3;
            }

        }
        return ans.toString();
    }

    public static void main(String[] args) {
        String ip = "G()(al)()()";
        System.out.println(interpret(ip));
    }
}
