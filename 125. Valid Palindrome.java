/* A phrase is a palindrome if, after converting all uppercase letters into lowercase letters and removing all non-alphanumeric characters, 
it reads the same forward and backward. Alphanumeric characters include letters and numbers.

Given a string s, return true if it is a palindrome, or false otherwise. */

class Solution {
    public boolean isPalindrome(String s) {
        List<Character>list=new ArrayList<>();
        List<Character>list1=new ArrayList<>();

        for(int i=0;i<s.length();i++)
        {
            char c=s.charAt(i);
            if(Character.isLetterOrDigit(c))
            {
                    char ch=Character.toLowerCase(c);
                    list.add(ch);
                    list1.add(ch);
            } 
        }
        if(list.isEmpty()) return true;
         Collections.reverse(list1);
           
          int c=0;
          for(int i=0;i<list.size();i++)
          {
            if(list.get(i).equals(list1.get(i))) c++;
          }

         if(c==list.size()) 
            return true;
        else 
            return false;
    }
}
