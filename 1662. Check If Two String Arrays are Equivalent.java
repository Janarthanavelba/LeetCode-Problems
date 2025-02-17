/* Given two string arrays word1 and word2, return true if the two arrays represent the same string, and false otherwise.

A string is represented by an array if the array elements concatenated in order forms the string. */

class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {


        List<Character>list1=new ArrayList<>();
        List<Character>list2=new ArrayList<>();

        for(int i=0;i<word1.length;i++)
        {
            String s=word1[i];

            for(int j=0;j<s.length();j++)
            {
                char c=s.charAt(j);
                list1.add(c);
            }
        }

        for(int i=0;i<word2.length;i++)
        {
            String s=word2[i];

            for(int j=0;j<s.length();j++)
            {
                char c=s.charAt(j);
                list2.add(c);
            }
        }

        if(list1.equals(list2)) return true;
        else return false;        
        
    }
}
