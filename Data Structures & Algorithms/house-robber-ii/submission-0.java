class Solution {
    public int rob(int[] nums) {
        return robber(nums);
    }
    public int robber(int [] nums){
        int n = nums.length;
        if(n ==1 ) return nums[0];

        int [] dp1 = new int[n];
        int [] dp2 = new int[n];

        Arrays.fill(dp1, -1);
        Arrays.fill(dp2, -1);

        int inc = solve(nums, 0, n-1, dp1);
        int exc = solve(nums, 1, n, dp2);
        return Math.max(inc, exc);

    }
    public int solve(int[] nums, int i ,int end,  int[] dp){
        if(i >= end){
            return 0;
        }
        if(dp[i] != -1) return dp[i];
        int inc = nums[i] + solve(nums, i+2,end, dp);
        int exc = solve(nums, i+1,end,  dp);
        return dp[i] = Math.max(inc, exc);
    }
}
