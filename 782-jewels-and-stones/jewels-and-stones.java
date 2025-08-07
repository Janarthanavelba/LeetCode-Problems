class Solution {
    public int numJewelsInStones(String jewels, String stones) {

        int c=0;

        int s1=jewels.length();
        int s2=stones.length();

        for(int i=0;i<s1;i++)
        {
            char c1=jewels.charAt(i);
            for(int j=0;j<s2;j++)
            {
                if(stones.charAt(j)==c1) c++;
            }
        }
       return c; 
    }
}