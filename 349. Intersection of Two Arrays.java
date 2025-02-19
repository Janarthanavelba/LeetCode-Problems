/* Given two integer arrays nums1 and nums2, return an array of their intersection. 
  Each element in the result must be unique and you may return the result in any order. */

class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {

        Set<Integer>list=new HashSet<>();

        for(int i=0;i<nums1.length;i++)
        {
            for(int j=0;j<nums2.length;j++)
            {
                if(nums1[i]==nums2[j]) list.add(nums1[i]);
            }
        }

        int arr[]=new int[list.size()];
        

        List<Integer>res=new ArrayList<>(list);

        for(int i=0;i<res.size();i++)
        {
            arr[i]=res.get(i);
        }

        return arr;
    
        
    }
}
