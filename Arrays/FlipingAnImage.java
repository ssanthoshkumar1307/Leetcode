class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
        int matrix[][]=new int[image.length][image[0].length];
        for(int i=0;i<image.length;i++)
        {
            int k=0;
            for(int j=image[0].length-1;j>=0;j--)
            {
                matrix[i][k++]=image[i][j];
            }
        }
        for(int i=0;i<matrix.length;i++)
        {
            for(int j=0;j<matrix[0].length;j++)
            {
                if(matrix[i][j]==0)matrix[i][j]=1;
                else matrix[i][j]=0;
            }
        }
        return matrix;
    }
}