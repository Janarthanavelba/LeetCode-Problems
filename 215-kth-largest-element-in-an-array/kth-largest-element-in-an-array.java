class Solution {
    public int findKthLargest(int[] nums, int k) {

       // Set<Integer>set=new HashSet<>();

        

        // List<Integer>list=new ArrayList<>();

        // for(int a:nums) list.add(a);

        // Collections.sort(list);

        Arrays.sort(nums);

        return nums[nums.length-k];
        
    }
}