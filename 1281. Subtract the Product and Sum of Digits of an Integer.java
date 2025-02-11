/* Given an integer number n, return the difference between the product of its digits and the sum of its digits. */

class Solution {
    public int subtractProductAndSum(int n) {

        int sum=0,product=1;

        while(n>0)
        {
            int a=n%10;
            sum=sum+a;
            product=product*a;
            n/=10;
        }

        return product-sum;
        
    }
}
