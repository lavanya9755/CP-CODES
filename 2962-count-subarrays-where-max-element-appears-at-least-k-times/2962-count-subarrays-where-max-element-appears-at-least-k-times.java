class Solution {
    public long countSubarrays(int[] nums, int k) {
        int max = Integer.MIN_VALUE;
        int n = nums.length;
        for(int i =0;i<n;i++){
            max = Math.max(max,nums[i]);
        }
        int left =0;
        long count = 0;
        long res = 0;
        for(int i=0;i<n;i++){
            if(nums[i] == max) count++;
            while(count >=k){
                if(nums[left] == max) count--;
                left++;
            }
            res+=left;
        }
        return res;
}
}