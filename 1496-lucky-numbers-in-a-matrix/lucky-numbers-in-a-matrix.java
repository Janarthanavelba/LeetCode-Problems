class Solution {
    public List<Integer> luckyNumbers(int[][] matrix) {
        int m=matrix.length;
        int n=matrix[0].length;
        List<Integer>list=new ArrayList<>();

        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(MaxInCol(matrix[i][j],j,matrix) && MinInRow(matrix[i][j],i,matrix)) list.add(matrix[i][j]);
            }
        }    
        return list;
    }
     public boolean MinInRow(int min, int i,int[][] matrix)
       {
        boolean isMin=true;
        int n=matrix[0].length;
        for(int j=0;j<n;j++)
        {
            if(matrix[i][j]<min) isMin=false;
        }
        return isMin;
       }
        public boolean MaxInCol(int max,int j,int[][] matrix)
       {
        int m=matrix.length;
        boolean isMax=true;
        for(int i=0;i<m;i++)
        {
            if(matrix[i][j]>max) isMax=false;
        }
        return isMax;
       }
}