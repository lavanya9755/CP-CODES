class Solution {
    public void setZeroes(int[][] matrix) {

        int m = matrix.length;
        int n = matrix[0].length;

        ArrayList<ArrayList<Integer>> arr = new ArrayList<>();
        for(int i=0;i<m;i++){
            for(int j =0;j<n;j++){
                if(matrix[i][j] == 0){
                    arr.add(new ArrayList<>(Arrays.asList(i, j)));
                }
            }
        }
        int l = arr.size();

        for(int a=0;a<l;a++){
            int o = arr.get(a).get(0);
            int p = arr.get(a).get(1);
            zerRowCol(matrix,o,p);
          }  
    }
    void zerRowCol(int[][] matrix,int i,int j){
            int n = matrix[0].length;
            for(int k=0;k<n;k++){
                matrix[i][k] =0;
            }

            int m = matrix.length;
            for(int k=0;k<m;k++){
                matrix[k][j] =0;
            }
        }
}