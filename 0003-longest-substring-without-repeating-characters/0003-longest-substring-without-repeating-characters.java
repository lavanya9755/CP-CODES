class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        int maxLength = 0;
        List<Character> list = new ArrayList<Character>();
        int start = 0;
        int end = 0;
        
        while(end<n){
            if(!list.contains(s.charAt(end))){
                list.add(s.charAt(end));
                end++;
                maxLength = Math.max(maxLength,list.size());

            }else{
                list.remove(Character.valueOf(s.charAt(start)));
                start++;
            }
        }
        return maxLength;
        
    }
}