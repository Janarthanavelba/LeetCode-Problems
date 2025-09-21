class Solution {
    public int findLucky(int[] arr) {

        int res=-1;
        int n=arr.length;
        Arrays.sort(arr);

        for(int i=0;i<n;i++)
        {
            int c=0;
            for(int j=0;j<n;j++)
            {
                if(arr[i]==arr[j]) c++;
            }
            if(c==arr[i]) res=arr[i];
        }

        return res;
        
    }
}