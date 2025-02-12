class Solution {
    public String longestCommonPrefix(String[] strs) {
        String pre = strs[0];
        for (int i =1 ;i<strs.length;i++){
            int j =0;
            while(j<pre.length() && j<strs[i].length() && pre.charAt(j) == strs[i].charAt(j)){
                j++;
            }
            pre = pre.substring(0,j);
            if(pre.length() == 0)return "";
        }
        return pre;

    }
}