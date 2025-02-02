class Solution {
    public int minFallingPathSum(int[][] matrix) {
        
        for(int i=matrix.length-2;i>=0;i--)
        {
            for(int j=0;j<matrix[i].length;j++)
            {
                if(j==0)
                {
                    matrix[i][j] += Math.min(matrix[i+1][j],matrix[i+1][j+1]);
                }
                else if(j==matrix.length-1)
                {
                    matrix[i][j] += Math.min(matrix[i+1][j],matrix[i+1][j-1]);
                }
                else
                {
                    matrix[i][j] += Math.min(matrix[i+1][j-1],Math.min(matrix[i+1][j],matrix[i+1][j+1]));
                }
            }
        }
        
        int min = Integer.MAX_VALUE;
        
        for(int i=0;i<matrix[0].length;i++)
        {
            if(min>matrix[0][i])
            {
                min = matrix[0][i];
            }
        }
        
        return min;
    }
}