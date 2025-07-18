class Solution {
    public int prefixCount(String[] words, String pref) {

        int c=0;

        for(int i=0;i<words.length;i++)
        {
            String s=words[i];
            if(s.length()>=pref.length())
            {
            int cc=0;
            for(int j=0;j<pref.length();j++)
            {
                if(s.charAt(j)==pref.charAt(j)) cc++;
            }
            
            if(cc==pref.length()) c++;
            }
        }
        return c;
    }
}