class Solution {
   
    public int countSubstrings(String s) {
        
        return solve(s);
    }
    public int solve(String s){
        int count =0 ;
        int n = s.length();
        for(int i = 0; i< n; i++){
            count += Palindrome(s, i, i);
            count += Palindrome(s, i, i+1);
        }
        return count;
    }
    public int Palindrome(String s, int i , int j){
        int count= 0;
        while(i >= 0 && j < s.length() && s.charAt(i) == s.charAt(j)){
            count++;
            i--;
            j++;
        }
        return count;
    }
}

    