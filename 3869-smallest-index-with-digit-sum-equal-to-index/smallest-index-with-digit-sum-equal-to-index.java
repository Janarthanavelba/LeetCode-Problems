class Solution {
    public int smallestIndex(int[] nums) {

        for(int i=0;i<nums.length;i++)
        {
            int n=nums[i],sum=0;
            while(n>0)
            {
                int a=n%10;
                sum+=a;
                n/=10;
            }
            if(i==sum) return i;
        }
       return -1; 
    }
}