import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<String> summaryRanges(int[] nums) {
        List<String> res = new ArrayList<>();
        if (nums.length == 0) return res;

        int prev = 0;

        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i + 1] != nums[i] + 1) {
                if (prev == i) {
                    res.add(Integer.toString(nums[i]));
                } else {
                    res.add(nums[prev] + "->" + nums[i]);
                }
                prev = i + 1;
            }
        }

        // Add the last range or single number
        if (prev == nums.length - 1) {
            res.add(Integer.toString(nums[prev]));
        } else {
            res.add(nums[prev] + "->" + nums[nums.length - 1]);
        }

        return res;
    }
}
