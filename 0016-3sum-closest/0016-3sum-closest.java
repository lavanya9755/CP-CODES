class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int closet_sum=nums[0] + nums[1] + nums[2];;
        for (int i = 0; i < nums.length-2; i++){
            int j = i + 1;
            int k = nums.length - 1;
            while (j < k) {
                int sum = nums[i] + nums[j] + nums[k];
                if(sum == target) return sum;
                if (Math.abs(closet_sum-target) > Math.abs(target-sum)) {
                    closet_sum = sum;
                } else if (sum < target) {
                    j++;
                } else {
                    k--;
                }
            }
        }
        
        return closet_sum;
    }
}