class Solution {
    public String interpret(String command) {

        String s="";
        int n=command.length();

        for(int i=0;i<n;i++)
        {
            if(command.charAt(i)=='G') s+='G';
            else if(command.charAt(i)=='('&&command.charAt(i+1)==')')
            {
                s+='o';
                i++;
            }
            else
            {
                s=s+'a'+'l';
                i=i+3;
            }
        }
       return s; 
    }
}