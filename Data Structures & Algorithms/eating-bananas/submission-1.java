class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int n = piles.length;
        int left = 1;
        int right = Arrays.stream(piles).max().getAsInt(); 
        while(left < right){
            int mid = left + (right - left) /2 ;
            if(CanEat(piles, h, mid)){
                right = mid;
            }
            else{
                left = mid+1;
            }
        }
        return left;
    }
    public static  boolean CanEat(int[] arr, int h, int mid){
        int actualHours = 0;
        for(int x : arr){
            actualHours += x / mid;
            if(x % mid!= 0){
                actualHours++;
            }
        }
        return actualHours <= h;

    }
}
