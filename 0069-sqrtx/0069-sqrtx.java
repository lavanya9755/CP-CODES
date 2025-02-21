class Solution {
    public static int mySqrt(int num) {
        if (num == 0 || num == 1) return num;

        int start = 1, end = num, ans = 0;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            
            if (mid == num / mid) return mid;
            
            if (mid < num / mid) {
                start = mid + 1;
                ans = mid;  
            } else {
                end = mid - 1;
            }
        }
        return ans; 
    }
}