class Solution {
    public int firstMissingPositive(int[] nums) {
        // Map<Integer,Integer> hash=  new HashMap<>();
        int n = nums.length;
        // for(int i=0;i<n;i++){
        //     hash.put(nums[i], hash.getOrDefault(nums[i],0)+1);
        // }
        
        for(int i=1;i<=n;i++){
            if(!(nums[i] <= n)){
                return i;
            }
        }
        return n+1;
    }
}