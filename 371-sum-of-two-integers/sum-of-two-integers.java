class Solution {
    public int getSum(int a, int b) {

        int c = 0;
        // List<Integer>list=new ArrayList<>();

        if (a < 0)
        {
            for (int i = a; i < 0; i++)
                c--;
        }
        if (b > 0)
        {
            for (int i = 0; i < b; i++)
                c++;
        } 
        if (a > 0)
        {
             for (int i = 0; i < a; i++)
                c++;
        }
        if(b<0)
        {
            for(int i=b;i<0;i++) c--;
        }

        return c;
    }
}