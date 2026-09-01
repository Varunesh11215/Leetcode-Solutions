class Solution {
    public long numberOfWays(String s) {
        long one=0;
        long zero=0;
        long oz=0;
        long zo=0;
        long ways=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='0'){
                zero++;
                oz+=one;
                ways+=zo;
            }
            else{
                one++;
                zo+=zero;
                ways+=oz;
            }
        }
        return ways;
    }
}