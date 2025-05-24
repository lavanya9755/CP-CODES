class Solution {
    public List<Integer> findWordsContaining(String[] words, char x) {
        ArrayList<Integer> arr = new ArrayList<>();
        int n = words.length;
        for(int i =0;i<n;i++){
            String s = words[i];
            if(s.contains(String.valueOf(x))){
                arr.add(i);
            }
        }

        return arr;
    }
}