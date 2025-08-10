class Solution {
    public int[] countBits(int n) {

         int []res=new int[n+1];

         for(int i=0;i<=n;i++)
         {
            String bi = Integer.toBinaryString(i);
            int sum=0;
            for(int j=0;j<bi.length();j++)
            {
                int c=bi.charAt(j)-'0';
                sum=sum+c;
            }
            res[i]=sum;
         }
        return res;
    }
}