class Solution {
    public int maxProduct(int n) {
int res=0;
List<Integer>list=new ArrayList<>();
        while(n>0)
        {
            int a=n%10;
            list.add(a);
            n=n/10;
        }
        for(int i=0;i<list.size();i++)
        {
            for(int j=i+1;j<list.size();j++)
            {
                int a=list.get(i)*list.get(j);
                if(a>res) res=a;
            }
        }
        return res;
    }
}