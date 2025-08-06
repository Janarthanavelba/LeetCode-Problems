class Solution {
    public List<Integer> findDuplicates(int[] nums) {

        List<Integer>res=new ArrayList<>();

        Set<Integer>set=new HashSet<>();

        for(int a:nums)
        {
            if(!set.add(a)) res.add(a);
        }
       return res; 
    }
}