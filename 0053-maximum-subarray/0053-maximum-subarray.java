class Solution {
     public int maxSubArray(int[] nums) {
        return maxSubArray(nums,0,nums.length-1);
    }
    public int maxSubArray(int[] nums,int left,int right){
        if(left==right){
            return nums[left];
        }
        int mid = (left+right)/2;
   
        int leftsum = maxSubArray(nums,left,mid);
        int rightsum = maxSubArray(nums,mid+1,right);

        int crosssum = crossSum(nums,left,mid,right);

        return Math.max(leftsum,Math.max(rightsum,crosssum));

    }

    public int crossSum(int[] nums, int left,int mid, int right){
        int leftSum = Integer.MIN_VALUE;
        int sum = 0;
        
        for (int i = mid; i >= left; i--) {
            sum += nums[i];
            leftSum = Math.max(leftSum, sum);
        }

        int rightSum = Integer.MIN_VALUE;
        sum = 0;
        
        for (int i = mid + 1; i <= right; i++) {
            sum += nums[i];
            rightSum = Math.max(rightSum, sum);
        }
        return leftSum + rightSum;
    }
}
   
