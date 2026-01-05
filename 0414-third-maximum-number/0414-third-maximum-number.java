class Solution {
    public int thirdMax(int[] nums) {
        // int max = Integer.MIN_VALUE,smax = Integer.MIN_VALUE,tmax=Integer.MIN_VALUE;
        HashSet<Integer> set = new HashSet<>();
        for(int i =0; i< nums.length ; i++){
            set.add(nums[i]);
        }
        List<Integer> list = new ArrayList<>(set);
        Collections.sort(list, Collections.reverseOrder());
        if(list.size() < 3){
            return list.get(0);
        }
        return list.get(2);
    }
}