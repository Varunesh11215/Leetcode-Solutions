class Solution {
    public long numberOfWays(String s) {
        long one=0,zero=0,oz=0,zo=0,ways=0;
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