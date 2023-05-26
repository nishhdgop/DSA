//1st method
class Solution {
    private int find(int i,int j, int m,int n, int dp[][]){
        //if in range
        if(i==m-1||j==n-1)return 1;
        // if out of range
        if(i>=m || j>=n)return 0;
        // if already computed
        if(dp[i][j]!=-1)return dp[i][j];
        return dp[i][j]= find(i+1,j,m,n,dp)+find(i,j+1,m,n,dp);
    }
    public int uniquePaths(int m, int n) {
        int dp[][] = new int[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                dp[i][j]=-1;
            }
        }
        return find(0,0,m,n,dp);
    }
}

//2nd method
//combinations

