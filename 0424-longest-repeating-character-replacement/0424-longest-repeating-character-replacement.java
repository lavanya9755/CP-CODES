class Solution {
    public int characterReplacement(String s, int k) {
        int l=0,r=0,maxcount=0;
        int n = s.length();
        Map<Character,Integer> result = new HashMap<Character,Integer>();

        while(r<n){
            char ch = s.charAt(r);
            result.put(ch,result.get(ch)+1);
            int len = s.substring(l,r+1).length();
            int max= Collections.max(result.values());
            if(len-max <= k){
                maxcount = len;
                r++;
            }else{
                result.remove(s.charAt(l));
                l++;   
            }
        }
         return maxcount;
}
}