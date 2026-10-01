class Solution {
    public int coinChange(int[] coins, int amount) {
        int[][] dp = new int[coins.length][amount+1];
        for(int[] a: dp) Arrays.fill(a, -1);
        int ans = solve(coins, amount,0,dp);
        if(ans >= (int) 1e9){
            return -1;
        }
        else{
            return ans;
        }
    }
    public int solve(int[] coins, int amount, int i, int[][] dp){
        if(amount == 0) return 0;
        if(i == coins.length || amount < 0) return (int) 1e9;
        if(dp[i][amount] != -1) return dp[i][amount];
        int inc = 0, exc = 0;
       
        inc = 1+ solve(coins, amount- coins[i], i,dp);
        
        exc = solve(coins, amount, i+1,dp);
        return dp[i][amount]=Math.min(inc, exc);
    }
}
