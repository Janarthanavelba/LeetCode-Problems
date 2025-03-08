You are given an n x n 2D matrix representing an image, rotate the image by 90 degrees (clockwise).

You have to rotate the image in-place, which means you have to modify the input 2D matrix directly.

  class Solution {
    public void rotate(int[][] matrix) {

        int n1=matrix.length;
        int n2=matrix[0].length;
        int arr[][]=new int[n1][n2];
         int l=0;
        for(int i=0;i<n1;i++)
        {
           
            int k=n2-1;
            for(int j=0;j<n2;j++)
            {
                arr[i][j]=matrix[k][l];
                k--;
            }
            l++;
        }
  
        for(int i=0;i<n1;i++)
        {
           
            for(int j=0;j<n2;j++)
            {
                
             
               matrix[i][j]=arr[i][j];
            }
        
        }
       
    }
}
