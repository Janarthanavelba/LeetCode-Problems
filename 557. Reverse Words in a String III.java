/* Given a string s, reverse the order of characters in each word within a sentence while still preserving whitespace and initial word order.

Example 1:
Input: s = "Let's take LeetCode contest"
Output: "s'teL ekat edoCteeL tsetnoc"
  
Example 2:
Input: s = "Mr Ding"
Output: "rM gniD" */

class Solution {
    public String reverseWords(String s) {
        
        String[]arr=s.split(" ");

        for(int i=0;i<arr.length;i++)
        {
            String s1=arr[i];
            String s2="";
            for(int j=s1.length()-1;j>=0;j--)
            {
                s2=s2+s1.charAt(j);
            }
            arr[i]=s2;
        }

        String res=arr[0];

        for(int i=1;i<arr.length;i++)
        {
            res=res+" "+arr[i];
        }

        return res;

    }
}
