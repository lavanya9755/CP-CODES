
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.ArrayList;
import java.util.List;
class Solution {
    public int missingNumber(int[] nums) {
        ArrayList<Integer> list = new ArrayList<>();

        for (int num : nums) {
            list.add(num);  
        }
        for(int i =0; i<=nums.length;i++){
            if(!(list.contains(i))){
                return i;
                
            }
        }

        return 0;
       
    }
}