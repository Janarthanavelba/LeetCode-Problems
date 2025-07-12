class Solution {
    public int totalMoney(int n) {

        int res=0,k=1,w=0;

        for(int i=1;i<=n;i++)
        {
            if(i%7==1)
            {
                w++;
                k=w;
            }
            res=res+k;
            k++;
        }
      return res;  
    }
}