class Solution {
    public int fib(int n) {
        
        int f0=0,f1=1,f2=1,f3=0;
        if(n==0) return f0;
        if(n==1 || n==2) return f1;
        for(int i=3;i<=n;i++)
        {
            f3=f2+f1;
            f1=f2;
            f2=f3;
            
        }
        return f3;
    }
}