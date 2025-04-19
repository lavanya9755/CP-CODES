class Solution(object):
    def countFairPairs(self, nums, lower, upper):
        ans = 0
        for i in range(len(nums)):
            for j in range(i+1, len(nums)):
                if nums[i] + nums[j] >= lower and nums[i] + nums[j] <= upper:
                    ans += 1
        return ans