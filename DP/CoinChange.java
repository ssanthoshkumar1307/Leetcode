class Solution {
    public int coinChange(int[] coins, int amount) {
        int n=coins.length;
        int dp[][]=new int[n][amount+1];
        for(int i=0;i<n;i++)dp[i][0]=0;
        for(int j=0;j<amount+1;j++)
        {
            if(j%coins[0]==0)
            {
                int val=j/coins[0];
                dp[0][j]=val;
            }
            else dp[0][j]=100000;
        }
        for(int i=1;i<n;i++)
        {
            for(int j=1;j<amount+1;j++)
            {
                if(j>=coins[i])dp[i][j]=Math.min(dp[i-1][j],1+dp[i][j-coins[i]]);
                else dp[i][j]=dp[i-1][j];
            }
        }
        if(dp[n-1][amount]!=100000)return dp[n-1][amount];
        else return -1;
    }
}