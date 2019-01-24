class Solution {
    public int numIslands(char[][] grid) {
        int ans = 0;
        for(int i = 0; i < grid.length; i++) {
            for(int j = 0; j < grid[0].length; j++) {
                if(grid[i][j] == '1') {
                    ans++;
                    dfs(grid, i, j);
                }
            }
        }
        return ans;
    }
    
    public void dfs(char[][] grid, int n, int m) {
        if(n >= 0 && m >= 0 && n < grid.length && m < grid[0].length && grid[n][m] == '1') {
            grid[n][m] = '0';
            dfs(grid, n, m - 1);
            dfs(grid, n, m + 1);
            dfs(grid, n - 1, m);
            dfs(grid, n + 1, m);
        }
    }
}