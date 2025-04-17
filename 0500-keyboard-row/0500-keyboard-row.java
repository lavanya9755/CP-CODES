class Solution {
    public String[] findWords(String[] words) {
        String row1 = "qwertyuiop";
        String row2 = "asdfghjkl";
        String row3 = "zxcvbnm";
        List<String> result = new ArrayList<>();


        for(String s:words){
            String lword = s.toLowerCase();
            if(check(lword,row1) || check(lword,row2) || check(lword,row3)){
                result.add(s);
                
            }

        }

        return result.toArray(new String[0]);
    }

    public boolean check(String lword,String row){
        for(char c:lword.toCharArray()){
            if(row.indexOf(c) == -1){
                return false;
            }
        }

         return true;
    }
}