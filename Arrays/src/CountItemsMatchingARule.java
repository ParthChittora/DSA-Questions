import java.util.*;
public class CountItemsMatchingARule {
    public static int indexOfRuleKey(String ruleKey){
        if(ruleKey.equals("type")){
            return 0;
        }
        if(ruleKey.equals("color") ){
            return 1;
        }
        if(ruleKey.equals("name")){
            return 2;
        }
        return -1;
    }
    public static int countMatches(List<List<String>> items, String ruleKey, String ruleValue){    int count = 0;
        int indexRuleKey = -1;
        switch (ruleKey){
            case "type" : {indexRuleKey =0;
                            break;}
            case "color" : {indexRuleKey =1;
                            break;}
            case "name" : indexRuleKey =2;
                            break;

        }
        for(List<String> str : items){
            if(str.get(indexRuleKey).equals(ruleValue)){
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        List<List<String>> items = new ArrayList<List<String>>() ;
        items.add(Arrays.asList("phone","blue","pixel"));
        items.add(Arrays.asList("computer","silver","lenovo"));
        items.add(Arrays.asList("phone","gold","iphone"));
        String ruleKey = "type", ruleValue = "phone";
        System.out.println(countMatches(items,ruleKey,ruleValue));
    }
}
