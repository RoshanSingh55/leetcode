class Solution {

    public int numSubmat(int[][] mat) {
        int rows = mat.length; 
        int cols = mat[0].length; 
        int[][] width = new int[rows][cols];
        for (int i = 0; i < rows; ++i) {
            for (int j = 0; j < cols; ++j) {
                if (mat[i][j] == 1) {
                    width[i][j] = (j == 0) ? 1 : 1 + width[i][j - 1];
                }
            }
        }
      
        int count = 0; 

        for (int i = 0; i < rows; ++i) {
            for (int j = 0; j < cols; ++j) {
                int minWidth = Integer.MAX_VALUE;
               
                for (int k = i; k >= 0 && minWidth > 0; --k) {
                    minWidth = Math.min(minWidth, width[k][j]);
                    count += minWidth; 
                }
            }
        }
      
        return count;  
    }
}