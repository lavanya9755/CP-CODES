class Solution {
    public int maxSubArray(int[] nums) {
        if(nums.length == 1) return nums[0];
        int max = -99999;
        int sum = 0;
        int i =0;
        while(i<nums.length){
            sum = sum + nums[i];
            if(sum > max){
                max = sum;

            }
            if(sum < 0){
                sum =0;
            }
            i++;
        }

        return max;
    }
}