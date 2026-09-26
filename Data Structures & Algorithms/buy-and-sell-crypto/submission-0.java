class Solution {
    public int maxProfit(int[] arr) {
        int n = arr.length;
        int minprofit = Integer.MAX_VALUE;
        int profit = 0;
        for(int i = 0; i< n ;i++){
            if(arr[i]<minprofit ){
                minprofit = arr[i];
            }
            int curr = arr[i]-minprofit;
            if(curr > profit){
                profit = curr;
            }
        }
        return profit;
    }
}
