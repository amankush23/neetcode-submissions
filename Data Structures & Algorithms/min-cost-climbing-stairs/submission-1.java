class Solution {
    public int minCostClimbingStairs(int[] nums) {
        int n = nums.length;
        int[] dp = new int[n+1];
        Arrays.fill(dp, -1);
        return Math.min(solve(nums, 0, dp), solve(nums, 1, dp));
    }
    public int solve(int[] nums, int i , int[] dp){
        if(i >= nums.length){
            return 0;
        }
        if(dp[i] != -1) return dp[i];
        int inc = nums[i] + solve(nums, i+2, dp);
        int exc = nums[i] + solve(nums, i+1, dp);
        return dp[i] = Math.min(inc, exc);
    }
}
