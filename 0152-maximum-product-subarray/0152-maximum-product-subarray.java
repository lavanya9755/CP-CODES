class Solution {
    public int maxProduct(int[] nums) {
        int max1 =0,max2=0;
        int product = 0;
        if(nums.length == 1){
            return nums[0];
        }


        for(int i=0;i<nums.length;i++){
            product = product * nums[i];
            max1 = Math.max(max1,product);
            if(product == 0){
                product=1;
            }
            
        }

        product =1;
        for(int j = nums.length-1;j>=0;j--){
            product = product * nums[j];
            max2 = Math.max(max2,product);
            if(product == 0){
                product=1;
            }
        }


        return Math.max(max1,max2);
    }
}