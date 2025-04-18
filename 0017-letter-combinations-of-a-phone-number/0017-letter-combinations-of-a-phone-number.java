class Solution {
    public List<String> letterCombinations(String digits) {
        List<String> res = new ArrayList<>();
        Map<Character,String> phone = new HashMap<>();
        phone.put('1',"null");
        phone.put('2',"abc");
        phone.put('3',"def");
        phone.put('4',"ghi");
        phone.put('5',"jkl");
        phone.put('6',"mno");
        phone.put('7',"pqrs");
        phone.put('8',"tuv");
        phone.put('9',"wxyz");

        if(digits.length() == 0 ) return res;
        solve(0,digits,"",res,phone);
    return res;
    }

private void solve(int i , String digits,String s, List<String> res,Map<Character,String> phone){
        if(i == digits.length()){
            res.add(s);
            return;
        }

        for(char c:phone.get(digits.charAt(i)).toCharArray()){
            String temp = new String(s);
            temp+=c;
            solve(i+1,digits,temp,res,phone);
        }
    
    }

    

}