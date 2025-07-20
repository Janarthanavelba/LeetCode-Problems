class Solution {
    public void setZeroes(int[][] matrix) {

        List<Integer>listI=new ArrayList<>();
        List<Integer>listJ=new ArrayList<>();

        for(int i=0;i<matrix.length;i++)
        {
            for(int j=0;j<matrix[i].length;j++)
            {
                if(matrix[i][j]==0)
                {
                    listI.add(i);
                    listJ.add(j);
                }
            }
        }

        for(int i=0;i<matrix.length;i++)
        {
            for(int j=0;j<matrix[i].length;j++)
            {
                if(listI.contains(i) || listJ.contains(j))
                {
                    matrix[i][j]=0;
                }
            }
        }

        
    }
}