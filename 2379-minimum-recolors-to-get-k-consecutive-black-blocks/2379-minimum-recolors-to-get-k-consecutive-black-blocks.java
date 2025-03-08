class Solution {
    public int minimumRecolors(String s, int k) {
        int wcount=0;
        int l=0,r=0;
        while(r<k){
            if(s.charAt(r)=='W'){
                wcount++;
            }
            r++;    
        }
        int res = wcount;
        r=k;
        while(r<s.length()){
            if(s.charAt(r)=='W')wcount++;
            if(s.charAt(l)=='W')wcount--;
            r++;
            l++;
            res = Math.min(res,wcount);
        }
        return res;

        

    }
}