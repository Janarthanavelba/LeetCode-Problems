class Solution {
    public int maximumGap(int[] nums) {

        int n=nums.length;

        if(n<2) return 0;

        Arrays.sort(nums);

        int md=0;

        for(int i=0;i<n-1;i++)
        {
            int d=nums[i+1]-nums[i];
            if(md<d) md=d;
        }
       return md; 
    }
}