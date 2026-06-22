class Solution {
    
    public int[] runningSum(int[]num){
        int [] prefix = new int [num.length];
        prefix[0]=num[0];
        for(int i=1;i<num.length;i++){
            prefix[i]=prefix[i-1]+num[i];
        }
        return prefix;
    }
}