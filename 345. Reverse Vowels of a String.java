/* Given a string s, reverse only all the vowels in the string and return it.
The vowels are 'a', 'e', 'i', 'o', and 'u', and they can appear in both lower and upper cases, more than once.

Example 1:
Input: s = "IceCreAm"
Output: "AceCreIm"

Explanation:
The vowels in s are ['I', 'e', 'e', 'A']. On reversing the vowels, s becomes "AceCreIm".

Example 2:
Input: s = "leetcode"
Output: "leotcede" */

class Solution {
    public String reverseVowels(String s) {

        char[]ch=s.toCharArray();
int a=ch.length-1;
        for(int i=0;i<ch.length;i++)
        {
            if(isvowel(ch[i]))
            {
            for(int j=a;j>i;j--)
            {
                if(isvowel(ch[j]))
                {
                    char c=ch[i];
                    ch[i]=ch[j];
                    ch[j]=c;
                    a=j-1;
                    break;
                }
            }
            }
        }

        return new String(ch);
        
    }
     boolean isvowel(char c)
        {
            if(c=='a' || c=='e' || c=='o' || c=='i' ||c=='u'|| c=='A' || c=='E'||c=='I'||c=='O'||c=='U' ) return true;
            else
            return false;
        }
}
