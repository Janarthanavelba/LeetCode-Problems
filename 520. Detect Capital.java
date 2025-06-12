/* We define the usage of capitals in a word to be right when one of the following cases holds:

All letters in this word are capitals, like "USA".
All letters in this word are not capitals, like "leetcode".
Only the first letter in this word is capital, like "Google".
Given a string word, return true if the usage of capitals in it is right.

Example 1:
Input: word = "USA"
Output: true
  
Example 2:
Input: word = "FlaG"
Output: false */

class Solution {
    public boolean detectCapitalUse(String word) {
        
        int count=0;
        for(int i=0;i<word.length();i++)
        {
            char c=word.charAt(i);

            if(Character.isUpperCase(c)) count++;

        }

        if(Character.isUpperCase(word.charAt(0)) && count ==1) return true;

        if(count==word.length() || count ==0) return true;

        return false;

    }
}
