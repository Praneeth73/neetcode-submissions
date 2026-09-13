class Solution {
    public int uniquePaths(int m, int n) {
        int[][] dp = new int[m][n];
        for(int[] row : dp){
            Arrays.fill(row,-1);
        }
        return uniquecombination(0,0,m,n,dp);
    }
    public int uniquecombination(int i,int j, int m, int n,int[][] dp){

        if(i == m-1 && j == n-1){
            return 1;
        }
        if(i > m-1 || j > n-1){
            return 0;
        }
        if(dp[i][j] != -1){
            return dp[i][j];
        }
        dp[i][j] = uniquecombination(i,j+1,m,n,dp) + uniquecombination(i+1,j,m,n,dp);
        return uniquecombination(i,j+1,m,n,dp) + uniquecombination(i+1,j,m,n,dp);

    }
}
