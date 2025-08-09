class Solution {
    public int countPrefixes(String[] words, String s) {

        int c=0;

        for(int i=0;i<words.length;i++)
        {
            String ss= words[i];
            boolean b=true;
            for(int j=0;j<Math.min(ss.length(),s.length());j++)
            {
                if(s.charAt(j)!=ss.charAt(j)) b=false;
            }
            if(b&&ss.length()<=s.length()) c++;
        }

        return c;
    }
}