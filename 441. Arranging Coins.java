/* You have n coins and you want to build a staircase with these coins. The staircase consists of k rows where the ith row has exactly i coins. The last row of the staircase may be incomplete.

Given the integer n, return the number of complete rows of the staircase you will build. */

class Solution 
{
    public int arrangeCoins(int n)
    {

        int a=n,z=1,c=0;

        while(true)
        {
            if(a>=z)
            {
                a=a-z;
                z++;
                c++;
            }
            else return c;
        }
    
    }
}
