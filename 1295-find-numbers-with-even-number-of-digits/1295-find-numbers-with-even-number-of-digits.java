class Solution {
    public int findNumbers(int[] nums) {
         int count=0;
        for(int num:nums){
            int n = String.valueOf(num).length();
            if(n%2==0){
                count++;
            }
        }
        return count;
    }
}