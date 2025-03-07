class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        Map<Integer,Integer> ans = new HashMap<>();
        int n =grid.length;
        int[] res= new int[2];

        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                ans.put(grid[i][j],ans.getOrDefault(grid[i][j],0)+1);
            }
        }

        for(int i=1;i<=(n*n);i++){
            if(ans.containsKey(i)){
                if(ans.get(i)==2)
                res[0]=i;
            }else{
                res[1]=i;
            }
        }
        return res;
        
    }
}