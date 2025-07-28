class Solution {
    public int finalPositionOfSnake(int n, List<String> commands) {

        int [][]mat=new int[n][n];
        int x=0;

        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                mat[i][j]=x++;
            }
        }
        int i=0,j=0;

        for(int k=0;k<commands.size();k++)
        {
            if(commands.get(k).equals("DOWN")) i=i+1;
            else if(commands.get(k).equals("RIGHT")) j=j+1;
            else if(commands.get(k).equals("UP")) i=i-1;
            else j=j-1;
        }
        return mat[i][j];
    }
}