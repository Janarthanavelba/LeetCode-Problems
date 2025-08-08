class Solution {
    public List<String> splitWordsBySeparator(List<String> words, char separator) {


        List<String>res=new ArrayList<>();
        int l=words.size();

        for(int i=0;i<l;i++)
        {
            String s=words.get(i);
 String n ="";
            for(int j=0;j<s.length();j++)
            {
               
                if(s.charAt(j)==separator)
                {
                    if(!n.equals("")){
                         res.add(n);
                         n="";
                    }
                 }
                else n=n+s.charAt(j);
            }
            if (!n.equals("")) {
                res.add(n);
            }
        }
        return res;
    }
}