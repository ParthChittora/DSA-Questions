import java.util.*;

public class CountItemsMatchingARule {
    //    public static int indexOfRuleKey(String ruleKey){
//        if(ruleKey.equals("type")){
//            return 0;
//        }
//        if(ruleKey.equals("color") ){
//            return 1;
//        }
//        if(ruleKey.equals("name")){
//            return 2;
//        }
//        return -1;
//    }
    public static int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
//        int count = 0;
//        int indexRuleKey = -1;
//        switch (ruleKey){
//            case "type" : {indexRuleKey =0;
//                            break;}
//            case "color" : {indexRuleKey =1;
//                            break;}
//            case "name" : indexRuleKey =2;
//                            break;
//
//        }
//        for(List<String> str : items){
//            if(str.get(indexRuleKey).equals(ruleValue)){
//                count++;
//            }
//        }
//        return count;

        int count =0 ;
        switch (ruleKey) {
            case "type":
                return search(items, ruleKey, ruleValue, 0, 0);
            case "color":
                return search(items, ruleKey, ruleValue, 0, 1);
            default:
                return search(items, ruleKey, ruleValue, 0, 2);
        }
    }

    static int search(List<List<String>> items, String ruleKey, String ruleValue, int i, int value) {
        if (items.size() == i)
            return 0;

        else if (items.get(i).get(value).equals(ruleValue)) {
            return 1 + search(items, ruleKey, ruleValue, i + 1, value);
        } else {
            return search(items, ruleKey, ruleValue, i + 1, value);
        }
    }

    public static void main(String[] args) {
        List<List<String>> items = new ArrayList<List<String>>();
        items.add(Arrays.asList("phone", "blue", "pixel"));
        items.add(Arrays.asList("computer", "silver", "lenovo"));
        items.add(Arrays.asList("phone", "gold", "iphone"));
        String ruleKey = "type", ruleValue = "phone";
        System.out.println(countMatches(items, ruleKey, ruleValue));
    }
}
