public class RomanToInteger {
        public  static int romanToInt(String s) {
            int num = 0;
            int prevNum = 0;
            int curNum;
            for (char c : s.toCharArray()) {
                curNum = getIntByLetter(c);
                if (((curNum == 5 || curNum == 10) && prevNum == 1)
                        || ((curNum == 50 || curNum == 100) && prevNum == 10)
                        || ((curNum == 500 || curNum == 1000) && prevNum == 100)) {
                    curNum -= prevNum;
                    prevNum = 0;
                }
                num += prevNum;
                prevNum = curNum;
            }
            num += prevNum;
            return num;
        }
        private static int getIntByLetter(char c) {
            return switch (c) {
                case 'I' -> 1;
                case 'V' -> 5;
                case 'X' -> 10;
                case 'L' -> 50;
                case 'C' -> 100;
                case 'D' -> 500;
                case 'M' -> 1000;
                default -> 0;
            };
        }

//     public static int romanToInt(String s) {
//         Map<Character,Integer> map = new HashMap<Character, Integer>();
//         int sum=0;
//         map.put('I',1);
//         map.put('V',5);
//         map.put('X',10);
//         map.put('L',50);
//         map.put('C',100);
//         map.put('D',500);
//         map.put('M',1000);
//         s=s.replace("IV","IIII");
//         s=s.replace("IX","VIIII");
//         s=s.replace("XL","XXXX");
//         s=s.replace("XC","LXXXX");
//         s=s.replace("CD","CCCC");
//         s=s.replace("CM","DCCCC");
//         for(int i=0;i<s.length();i++){
//             sum = sum + (map.get(s.charAt(i)));
//         }
//         return sum;
//     }


    public static void main(String[] args) {
        String s= "MCMXCIV";
        System.out.println(romanToInt(s));
    }
}
