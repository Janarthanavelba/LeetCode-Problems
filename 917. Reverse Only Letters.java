/* Given a string s, reverse the string according to the following rules:

All the characters that are not English letters remain in the same position.
All the English letters (lowercase or uppercase) should be reversed.
Return s after reversing it. */

class Solution {
    public String reverseOnlyLetters(String s) {
        
        char[]ch=s.toCharArray();
        int i=0,j=ch.length-1;

        while(i<j)
        {
            if(!Character.isLetter(ch[i])) i++;
            else if(!Character.isLetter(ch[j]))j--;
            else
            {
                char temp=ch[i];
                ch[i]=ch[j];
                ch[j]=temp;
                i++;
                j--;
            }     
        }
        String ss="";

        for(int k=0;k<ch.length;k++)
        {
            ss=ss+ch[k];
        }
        
        return ss;
    }
}
