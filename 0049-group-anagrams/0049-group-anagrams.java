class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>> res = new HashMap<>();
        for(String s : strs){
            char[] ab = s.toCharArray();
            Arrays.sort(ab);
            String sortstr = String.valueOf(ab);
            res.putIfAbsent(sortstr,new ArrayList<>());
            res.get(sortstr).add(s);

        }

        return new ArrayList<>(res.values());
    }
}