class Solution {
    public int lengthOfLIS(int[] nums) {
        int[] dp = new int[nums.length];
        int n = nums.length;
        dp[0] = 1;
        for(int i = 1; i< n ;i++){
            dp[i] =1;
            for(int j =0 ; j < i ;j++){
                if(nums[j] < nums[i] &&  dp[i] < dp[j]+1){
                    dp[i] = dp[j]+1;
                }
            }
        }
        return Arrays.stream(dp).max().getAsInt();
    }
}
