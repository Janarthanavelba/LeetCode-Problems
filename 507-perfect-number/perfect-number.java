class Solution {
    public boolean checkPerfectNumber(int num) {

        int n=0;

        for(int i=1;i<=num/2;i++)
        {
            if(num%i==0) n=n+i;
        }

        return n==num;
        
    }
}