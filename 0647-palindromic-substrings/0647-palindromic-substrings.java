class Solution {
    public int countSubstrings(String s) {
        if(s.length() == 1){
            return 1;
        }
        int max =0;
        for(int i=0;i<s.length();i++){
            max += isPalindrome(s,i,i);
            max += isPalindrome(s,i,i+1);
        }

        return max;
    }

    public int isPalindrome(String s,int l,int r){
        int count=0;
        while(l>=0 && r<s.length() && s.charAt(l)==s.charAt(r)){
                count++;
                l--;
                r++;
            
        }
        return count;
    }
}