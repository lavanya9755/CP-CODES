class Solution {
    public String minWindow(String s, String t) {
        Map<Character,Integer> mapT = new HashMap<>();
        for(int i=0;i<t.length();i++){
            mapT.put(t.charAt(i),mapT.getOrDefault(t.charAt(i),0)+1);
        }
        int req = mapT.size();
        int l=0,r=0;
        int create=0;
        int[] a= {-1,0,0};
         Map<Character,Integer> substringMap = new HashMap<Character,Integer>();
        while(r<s.length()){
            char c = s.charAt(r);
            substringMap.put(c,substringMap.getOrDefault(c,0)+1);
            if(mapT.containsKey(c) && substringMap.get(c).intValue() == mapT.get(c).intValue()){
                create++;
            }

            while(req == create){
               if(a[0]>r-l+1 || a[0] == -1){
                a[0]=r-l+1;
                a[1]=l;
                a[2]=r;
               }
            substringMap.put(s.charAt(l),substringMap.getOrDefault(s.charAt(l),0)-1);
               if(mapT.containsKey(s.charAt(l)) && substringMap.get(s.charAt(l)).intValue() < mapT.get(s.charAt(l)).intValue()){
                create--;
                }
                l++;
            }
            r++;
        }
        if(a[0] == -1){
            return "";}

        return s.substring(a[1],a[2]+1);
        
    }
}