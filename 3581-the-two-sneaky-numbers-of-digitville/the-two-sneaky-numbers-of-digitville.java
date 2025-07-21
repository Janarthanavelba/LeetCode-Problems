class Solution {
    public int[] getSneakyNumbers(int[] nums) {

        List<Integer>list=new ArrayList<>();
        int n=nums.length;

        for(int i=0;i<n;i++)
        {
            int c=1;
            for(int j=i+1;j<n;j++)
            {
                if(nums[i]==nums[j]) c++;
            }
            if(c==2) list.add(nums[i]);
        }

        int n1=list.size();

        int []res=new int[n1];

        for(int i=0;i<n1;i++)
        {
            res[i]=list.get(i);
        }
        return res;
    }
}