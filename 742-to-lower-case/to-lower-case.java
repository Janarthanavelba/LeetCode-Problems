class Solution {
    public String toLowerCase(String s) {
        String res="";
        for(int i=0;i<s.length();i++)
        {
            char c=Character.toLowerCase(s.charAt(i));
            res=res+c;
        }
return res;
    }
}