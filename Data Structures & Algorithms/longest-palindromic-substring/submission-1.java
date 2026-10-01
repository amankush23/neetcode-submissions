class Solution {
    static String ans = "";
    static int max = 0;
    public String longestPalindrome(String s) {
        ans = "";
        max = 0;
        return solve(s);
    }
    public String solve(String s){
        int n = s.length();
        for(int i = 0; i< n; i++){
            for(int j = i ; j < n; j++){
                String temp = s.substring(i, j+1);
                if(Palindrome(temp)){
                    if(temp.length() > max) {
                        max = temp.length();
                        ans = temp;
                    }
                }
            }
        }
        return ans;
    }

    public boolean Palindrome(String s){
        int i = 0;
        int j = s.length()-1;
        while(i < j){
            if(s.charAt(i) != s.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}
