class Solution {
    public boolean squareIsWhite(String coordinates) {

        char c1=coordinates.charAt(0);
        char c2=coordinates.charAt(1);
        int n1=0;
        int n2=c2-'0';

        if(c1=='a'||c1=='c'||c1=='e'||c1=='g') n1=1;

        if(n1%2==0&&n2%2==0 || n1%2!=0&&n2%2!=0 ) return false;
        
    return true;
    }
}