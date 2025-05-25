class Solution {
    public int longestPalindrome(String[] words) {
        Map<String, Integer> freq = new HashMap<>();
        for (String word : words) {
            freq.put(word, freq.getOrDefault(word, 0) + 1);
        }

        int length = 0;
        boolean central = false;

        for (String word : freq.keySet()) {
            String rev = new StringBuilder(word).reverse().toString();

            if (!word.equals(rev) && freq.containsKey(rev)) {
                int pairs = Math.min(freq.get(word), freq.get(rev));
                length += 4 * pairs;
                freq.put(word, freq.get(word) - pairs);
                freq.put(rev, freq.get(rev) - pairs);
            } else if (word.equals(rev)) {
                int count = freq.get(word);
                length += 4 * (count / 2);
                if (count % 2 == 1) central = true;
            }
        }

        if (central) length += 2;  
        return length;
    }
}
