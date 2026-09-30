class Solution {
    private int f(int i , int j , int ct , char[][] grid , int[][][] dp){
        if( i >= grid.length || j >= grid[0].length)return 0;
        ct += (grid[i][j] == '(' ? 1 : - 1);
        if(ct < 0)return 0;
        int remaining = (grid.length - 1 - i) + (grid[0].length - 1 - j);
        if (ct > remaining + 1) return 0;
        if(i == grid.length - 1 && j == grid[0].length - 1){
            if(ct == 0)return 1;
            else return 0;
        }
        if(dp[i][j][ct] != -1)return dp[i][j][ct];
        int right = f(i + 1, j , ct , grid, dp);
        int down  = f(i , j + 1 , ct , grid , dp);
        return dp[i][j][ct] = (right == 1 ? right : down);    
    }
    public boolean hasValidPath(char[][] grid) {
        int m = grid.length , n  = grid[0].length;
        int[][][] dp = new int[m][n][m + n];
        if ((m + n) % 2 == 0) return false;
        for(int i = 0 ;i < m ; ++i){
            for(int j  = 0 ; j < n ; ++j){
                Arrays.fill(dp[i][j],-1);
            }
        }
        return f(0,0,0,grid,dp) == 1;
    }
}