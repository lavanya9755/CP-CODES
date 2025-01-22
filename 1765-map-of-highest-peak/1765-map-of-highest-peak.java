class Solution {
    public int[][] highestPeak(int[][] isWater) {
        int n = isWater.length;
        int m = isWater[0].length;
        int[][] height= new int[n][m];
        Queue<int[]> que = new LinkedList<>();
        for (int i =0 ; i<n; i++){
            for (int j =0 ; j<m;j++){
                if (isWater[i][j] == 1){
                    que.add(new int[]{i,j});
                }else{
                    height[i][j] = -1;
                }
            }
        }

        int[][] dir = {{0,1},{0,-1},{1,0},{-1,0}};
        while(!que.isEmpty()){
            int[] arr = que.poll();
            int r=arr[0];
            int c = arr[1];

            for(int[] d:dir){
                int nr = r+d[0];
                int nc = c+d[1];
            

            if(nr>=0 && nr<n && nc>=0 && nc<m && height[nr][nc] == -1){
                height[nr][nc] = height[r][c]+1;
                que.add(new int[]{nr,nc});
            }
        }
    }
    return height;
    }
}