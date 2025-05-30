class Solution {
    public int distributeCandies(int[] candyType) {
        HashSet<Integer> s=new HashSet<>();
        int n=candyType.length;
        for(int num:candyType)
        {
            s.add(num);
        }
        if(s.size()>=(n/2))
        {
          return n/2;
        }
        return s.size();
        
    }
}