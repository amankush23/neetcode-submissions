class Solution {
    public int characterReplacement(String s, int k) {
        int left = 0;
        int maxf = 0;
        int ans = 0;

        HashMap<Character, Integer> map = new HashMap<>();
        for(int right = 0; right < s.length(); right++){
            map.put(s.charAt(right), map.getOrDefault(s.charAt(right),0)+1);
            maxf = Math.max(maxf, map.get(s.charAt(right)));
            while((right - left+1) - maxf > k){
                char leftChar = s.charAt(left);
                map.put(leftChar, map.get(leftChar)-1);
                left++;
            }
            ans = Math.max(ans, right - left + 1);
        }
        return ans;
    }
}
