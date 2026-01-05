class Solution {
public:
    void calc(vector<int> nums,int target,int i,int j,vector<int> &s){
        if(i>=nums.size() || j<0){
            return;
        }
        if(nums[i]+nums[j]==target){
            s.push_back(i);
            s.push_back(j);
            return;
        }
        calc(nums,target,i+1,j,s);
        calc(nums,target,i,j-1,s);
    }
    vector<int> twoSum(vector<int>& nums, int target) {
        int i=0;
        int j=nums.size()-1;
        vector<int> s;
        calc(nums,target,i,j,s);
        return {s[0],s[1]};
    }
};