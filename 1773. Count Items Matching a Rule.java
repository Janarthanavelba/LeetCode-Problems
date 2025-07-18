/* You are given an array items, where each items[i] = [typei, colori, namei] describes the type, color, and name of the ith item. You are also given a rule represented by two strings, ruleKey and ruleValue.

The ith item is said to match the rule if one of the following is true:
ruleKey == "type" and ruleValue == typei.
ruleKey == "color" and ruleValue == colori.
ruleKey == "name" and ruleValue == namei.
Return the number of items that match the given rule.

Example 1:
Input: items = [["phone","blue","pixel"],["computer","silver","lenovo"],["phone","gold","iphone"]], ruleKey = "color", ruleValue = "silver"
Output: 1
Explanation: There is only one item matching the given rule, which is ["computer","silver","lenovo"].
  
Example 2:
Input: items = [["phone","blue","pixel"],["computer","silver","phone"],["phone","gold","iphone"]], ruleKey = "type", ruleValue = "phone"
Output: 2
Explanation: There are only two items matching the given rule, which are ["phone","blue","pixel"] and ["phone","gold","iphone"]. Note that the item ["computer","silver","phone"] does not match. */

class Solution {
    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {

        List<String>type=new ArrayList<>();
        List<String>colour=new ArrayList<>();
        List<String>name=new ArrayList<>();

        for(int i=0;i<items.size();i++)
        {
            List<String>temp=new ArrayList<>(items.get(i));
            for(int j=0;j<temp.size();j++)
            {
                if(j==0) type.add(temp.get(j));
                else if(j==1) colour.add(temp.get(j));
                else name.add(temp.get(j));
            }
        }
        int c=0;
if(ruleKey.equals("type"))
{
    for(int i=0;i<type.size();i++)
    {
        if(type.get(i).equals(ruleValue)) c++;
    }
}
else if(ruleKey.equals("color"))
{
    for(int i=0;i<colour.size();i++)
    {
        if(colour.get(i).equals(ruleValue)) c++;
    }
}
else
{
    for(int i=0;i<name.size();i++)
    {
        if(name.get(i).equals(ruleValue)) c++;
    }
}

     return c;   
    }
}
