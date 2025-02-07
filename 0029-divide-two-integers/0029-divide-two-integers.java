class Solution {
    public int divide(int dividend, int divisor) {
        // long int dv=dividend;
        // long int di=divisor;

        if(dividend/divisor <= Integer.MIN_VALUE){
            return Integer.MIN_VALUE;
        }else if(dividend/divisor >= Integer.MAX_VALUE){
            return Integer.MAX_VALUE;
        }else{
            return dividend/divisor;
        }

    }
}