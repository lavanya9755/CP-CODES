class Solution {
    public int countDays(int days, int[][] meetings) {
        int prevEnd = 0, len;
        Arrays.sort(meetings, Comparator.comparingInt(o -> o[0]));

        for(int[] meeting : meetings){
            int st = Math.max(prevEnd + 1, meeting[0]), end = meeting[1];
            len = end - st + 1;
            days -= Math.max(len, 0);
            prevEnd = Math.max(prevEnd, end);
        }

        
        return days;
    }
}