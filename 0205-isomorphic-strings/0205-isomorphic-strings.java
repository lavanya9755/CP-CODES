class Solution {
    public boolean isIsomorphic(String s, String t) {
        int shash[]=new int[200];
        int thash[]=new int[200];
        int n = s.length();
        if(s.length() != t.length()){
            return false;
        }

        for(int i=0;i<n;i++){
            if(shash[s.charAt(i)] != thash[t.charAt(i)]){
                return false;
            }
            
            shash[s.charAt(i)]=i+1;
            thash[t.charAt(i)]=i+1;

            
        }

        return true;
    }
}