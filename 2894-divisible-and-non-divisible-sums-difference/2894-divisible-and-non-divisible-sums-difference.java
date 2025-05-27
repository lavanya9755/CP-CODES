class Solution {
    public int differenceOfSums(int n, int m) {
        
        ArrayList<Integer> arr1 =  new ArrayList<>();
        ArrayList<Integer> arr2 =  new ArrayList<>();
        for(int i =1;i<=n;i++){
            if(i%m != 0 ){
                arr1.add(i);
            }else{
                arr2.add(i);
            }
        }

        int num1 = 0;
        for (int num : arr1) {
         num1 += num;
        }
        int num2 = 0;
        for (int num : arr2) {
            num2 += num;
        }

        return num1-num2;
    }
}