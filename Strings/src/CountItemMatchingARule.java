import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class CountItemMatchingARule {
    public static int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {

       

        switch(ruleKey){
            case "type": return search(items,ruleKey,ruleValue,0,0);
            case "color": return search(items,ruleKey,ruleValue,0,1);
            default: return search(items,ruleKey,ruleValue,0,2);
        }
    }

    static int search(List<List<String>> items, String ruleKey, String ruleValue, int i, int value){
        if(items.size()==i)
            return 0;

        else if(items.get(i).get(value).equals(ruleValue)){
            return 1+search(items, ruleKey,ruleValue,i+1,value);
        }
        else{
            return search(items, ruleKey, ruleValue, i+1,value);
        }
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

//      public int countMatches(List<List<String>> items, String ruleKey, String ruleValue){    int count = 0;
//         int indexRuleKey = -1;
//          if(ruleKey.equals("type")){
//             indexRuleKey = 0;
//         }
//         else if(ruleKey.equals("color") ){
//             indexRuleKey = 1;
//         }
//         else{
//             indexRuleKey = 2;
//         }

//         for(List<String> str : items){
//             if(str.get(indexRuleKey).equals(ruleValue)){
//                 count++;
//             }
//         }
//         return count;
// }

