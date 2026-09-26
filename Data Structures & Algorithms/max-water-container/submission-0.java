class Solution {
    public int maxArea(int[] heights) {
        int n = heights.length;
        int i = 0;
        int j = n-1;
        int maxheight = 0;
        while(i < j){
            int width = j-i;
            int h = Math.min(heights[i], heights[j]);
            int area = h * width;
            maxheight = Math.max(area, maxheight);
            if(heights[i] > heights[j]) j--;
            else i++;
        }
        return maxheight;
    }
}
