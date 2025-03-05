public class Solution {
    public String longestPalindrome(String s) {
        if (s.length() <= 1 || s==null) {
            return s;
        }
        int maxLen = 0;
       int l=0,r=0;

        for (int i = 0; i < s.length(); i++) {
         int len1 = isPalindrome(s,i,i);
         int len2 = isPalindrome(s,i,i+1);
         int len = Math.max(len1,len2);

         if(len > r-l){
            l = i - (len-1)/2;
            r = i+ len/2;
         }
        }
        return s.substring(l,r+1);
    }

    private int isPalindrome(String s,int l,int r) {
        
        while (l>=0 && r<s.length() && s.charAt(l) == s.charAt(r)) {
        
            l--;
            r++;       
         }
         return r-l-1;

    }
}