/* Given an array of integers nums, half of the integers in nums are odd, and the other half are even.
Sort the array so that whenever nums[i] is odd, i is odd, and whenever nums[i] is even, i is even.
Return any answer array that satisfies this condition.

Example 1:
Input: nums = [4,2,5,7]
Output: [4,5,2,7]
Explanation: [4,7,2,5], [2,5,4,7], [2,7,4,5] would also have been accepted.
  
Example 2:
Input: nums = [2,3]
Output: [2,3] */

class Solution {
    public int[] sortArrayByParityII(int[] nums) {

        List<Integer>odd=new ArrayList<>();
        List<Integer>even=new ArrayList<>();

        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]%2==0) even.add(nums[i]);
            else odd.add(nums[i]);
        }

        int []res=new int[nums.length];
        int a=0,b=0;
        for(int i=0;i<nums.length;i++)
        {
            if(i%2==0) 
            {
                res[i]=even.get(a);
                a++;
            }
            else
            {
                res[i]=odd.get(b);
                b++;
            }
        }
        return res;
    }
}
