class Solution {
    public int numberOfMatches(int n) {

        if(n==1) return 0;

        int m=1;

        while(n>2)
        {
            
            if(n%2==0)
            {
                 m=m+n/2;
                 n=n/2;
            }
            else
            {
                m=m+n/2;
                n=(n/2)+1;
            }
        }
        return m;
    }
}