class Solution {
    public int countPrefixes(String[] words, String s) {

        int c=0;

        for(int i=0;i<words.length;i++)
        {
            String ss= words[i];
            if(s.startsWith(ss)) c++;
        }

        return c;
    }
}