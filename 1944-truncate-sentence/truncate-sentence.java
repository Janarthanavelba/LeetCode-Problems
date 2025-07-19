class Solution {
    public String truncateSentence(String s, int k) {

        String res="";

        String[]arr=s.split(" ");

        res=res+arr[0];

        int i=1;

        while(i<k && i<arr.length)
        {
            res=res+" "+arr[i];
            i++;
        }
        return res;
    }
}