class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

       List<String>list1=new ArrayList<>();
       List<List<String>>res=new ArrayList<>();
      
        for(String str:strs)
        {
            char ch[]=str.toCharArray();
            Arrays.sort(ch);
            list1.add(new String(ch));
        }
     boolean[]boo=new boolean[strs.length];
        for(int i=0;i<list1.size();i++)
        {
            if(boo[i]) continue;
            List<String>inner=new ArrayList<>();
            inner.add(strs[i]);
            boo[i]=true;
            for(int j=i+1;j<list1.size();j++)
            {
                if(list1.get(i).equals(list1.get(j)))
                {
                    inner.add(strs[j]);
                    boo[j]=true;
                }
            }
            res.add(inner);
        }
        return res;
    }
}