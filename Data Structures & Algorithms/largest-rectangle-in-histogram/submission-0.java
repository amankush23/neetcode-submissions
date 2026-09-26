class Solution {
    public int largestRectangleArea(int[] heights) {
        int n = heights.length;
        int[] right = new int[n];
        int[] left = new int[n];
        Stack<Integer> st = new Stack<>();

        for(int i = n-1; i >= 0; i--){
            while(st.size()>0 && heights[st.peek()] >= heights[i]){
                st.pop();
            }
            right[i] = st.isEmpty() ? n : st.peek();
            st.push(i);
        }
        st.clear();
        for(int i = 0; i <n ; i++){
            while(st.size()>0 && heights[st.peek()] >= heights[i]){
                st.pop();
            }
            left[i] = st.isEmpty() ? -1 : st.peek();
            st.push(i);
        }
        int max = Integer.MIN_VALUE;
        for(int i = 0; i< n ; i++){
            int width = right[i]-left[i]-1;
            int area = heights[i] * width;
            max = Math.max(area, max);

        }
        return max;
    }
}
