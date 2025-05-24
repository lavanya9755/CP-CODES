class Solution {
    public void nextPermutation(int[] nums) {
        int n = nums.length;
        int id1 =-1,id2=-1;
        for(int i=n-2;i>=0;i--){
            if(nums[i]<nums[i+1]){
                id1 = i;
                // System.out.print("hello");
                break;
            }
        }
        if(id1==-1){
            reverse(nums,0);
          
        }else{
        // System.out.print("hello");

        for(int i=n-1;i>=0;i--){
            if(nums[id1]<nums[i]){
                id2 = i;
                break;
            }
        }

        swap(nums,id1,id2);
        reverse(nums,id1+1);

        }
    }

    public void swap(int[] nums, int id1,int id2){
        int temp;
        temp = nums[id2];
        nums[id2] = nums[id1];
        nums[id1] = temp;
    }

    public void reverse(int[] nums,int st){
        int i = st;
        int j = nums.length-1;
        while(j>i){
            swap(nums,i,j);
            i++;
            j--;
        }
        
    } 
}