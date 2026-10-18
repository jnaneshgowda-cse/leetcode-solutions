class Solution {
    public boolean isPalindrome(String s) {
        s = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        int len=s.length();
        String reverse="";
        for(int i=len-1;i>=0;i--){
            reverse=reverse+s.charAt(i);
        }
         if(s.equals(reverse)){
            return true;
         }
         return false;
    }
}