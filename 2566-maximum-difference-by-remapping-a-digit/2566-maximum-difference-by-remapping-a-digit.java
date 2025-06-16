class Solution {
    public int minMaxDifference(int num) {
        String str = Integer.toString(num);
        char[] minchar = str.toCharArray();
        char[] maxchar = str.toCharArray();

        char maxreplace = ' ';
        for(char c:minchar){
            if(c != '9'){
                maxreplace = c;
                break;
            }
        }
        //replace occurence of maxreplace with 9
        for (int i = 0; i < maxchar.length; i++) {
            if (maxchar[i] == maxreplace) {
                maxchar[i] = '9';
            }
        }

        char minreplace = minchar[0];
        for(int i=0;i<minchar.length;i++){
            if(minchar[i] == minreplace){
                minchar[i] = '0';
            }
        }

        int maxVal = Integer.parseInt(new String(maxchar));
        int minVal = Integer.parseInt(new String(minchar));

        return maxVal - minVal;
        
        
    }
}