class Solution {
    public int xorOperation(int n, int start) {

        int res=0,x=start;
        for(int i=0;i<n;i++)
        {
            res=res^x;
            x=x+2;
        }
      return res;  
    }
}