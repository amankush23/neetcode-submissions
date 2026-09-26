class Solution {
    public boolean isPalindrome(String s) {
        String res = s.replaceAll("[^a-zA-Z0-9]","");
        String Lower = res.toLowerCase();
        int i = 0;
        int j = Lower.length()-1;
        while(i < j){
            if(Lower.charAt(i) != Lower.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
    
}
