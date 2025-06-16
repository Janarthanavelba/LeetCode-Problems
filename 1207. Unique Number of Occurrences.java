/* Given an array of integers arr, return true if the number of occurrences of each value in the array is unique or false otherwise.

Example 1:
Input: arr = [1,2,2,1,1,3]
Output: true
Explanation: The value 1 has 3 occurrences, 2 has 2 and 3 has 1. No two values have the same number of occurrences.
  
Example 2:
Input: arr = [1,2]
Output: false
  
Example 3:
Input: arr = [-3,0,1,-3,1,1,1,-3,10,0]
Output: true */

class Solution {
    public boolean uniqueOccurrences(int[] arr) {

        HashSet<Integer>set=new HashSet<>();

         HashSet<Integer>res=new HashSet<>();

         List<Integer>list=new ArrayList<>();

         for(int i=0;i<arr.length;i++)
         {
            set.add(arr[i]);
         }
         List<Integer>list1=new ArrayList<>(set);

        for(int i=0;i<list1.size();i++)
        {
            int c=0;
            for(int j=0;j<arr.length;j++)
            {
                if(list1.get(i)==arr[j]) c++;
            }
            list.add(c);

        }
        for(int i=0;i<list.size();i++)
        {
           if(!res.add(list.get(i))) return false;
        }
        return true;
    }
}
