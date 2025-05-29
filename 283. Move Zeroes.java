/* Given an integer array nums, move all 0's to the end of it while maintaining the relative order of the non-zero elements.
Note that you must do this in-place without making a copy of the array.
Example 1:
Input: nums = [0,1,0,3,12]
Output: [1,3,12,0,0]
Example 2:
Input: nums = [0]
Output: [0] */

class Solution {
    public void moveZeroes(int[] nums) {

int n=nums.length;
int i=0;
        while (i < n) 
        {
            if(nums[i]==0)
            {
                
                for(int j=i+1;j<n;j++)
                {
                    nums[j-1]=nums[j];
                }
                nums[n-1]=0;
                n--;
            }
             else i++;
        }
        
    }
}
