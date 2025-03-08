/* Given a 1-indexed array of integers numbers that is already sorted in non-decreasing order, find two numbers such that they add up to a specific target number. 
Let these two numbers be numbers[index1] and numbers[index2] where 1 <= index1 < index2 <= numbers.length.

Return the indices of the two numbers, index1 and index2, added by one as an integer array [index1, index2] of length 2.

The tests are generated such that there is exactly one solution. You may not use the same element twice.

Your solution must use only constant extra space. */

class Solution {
    public int[] twoSum(int[] numbers, int target) {

        int arr[]=new int[2];

        int a=0,b=0;

        boolean z=false;

        for(int i=0;i<numbers.length;i++)
        {
            for(int j=i+1;j<numbers.length;j++)
            {
                if(numbers[i]+numbers[j]==target)
                {
                    a=i+1;
                    b=j+1;
                    z=true;
                    break;
                }
            }
            if(z) break;
        }
            
            arr[0]=a;
            arr[1]=b;

            return arr;
        
    }
}
