public class RobotReturnToOrigin {
    public static boolean judgeCircle(String moves) {
        int lrCount = 0;
        int udCount = 0;
        for (char c : moves.toCharArray()) {
            switch (c) {
                case 'L' -> lrCount++;// advanced switch case
                case 'R' -> lrCount--;
                case 'U' -> udCount++;
                case 'D' -> udCount--;
            }
        }
        return lrCount == 0 && udCount == 0;
    }

        public static void main(String[] args) {
        String a = "LLRRD";
        System.out.println(judgeCircle(a));
    }
}
