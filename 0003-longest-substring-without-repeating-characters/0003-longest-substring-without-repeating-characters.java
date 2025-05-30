class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        if (n == 1) {
            return 1;
        }
        // int maxLength = 0;
        // HashSet<Character> list = new HashSet<Character>();
        // int start = 0;
        // int end = 0;

        HashMap<Character, Integer> map = new HashMap<>();
        int left = 0, maxLen = 0;
        for (int right = 0; right < s.length(); right++) {
            if (map.containsKey(s.charAt(right))) {
                left = Math.max(left, map.get(s.charAt(right)) + 1);
            }
            map.put(s.charAt(right), right);
            maxLen = Math.max(maxLen, right - left + 1);
        }

        return maxLen;

    }
}