class Solution {
    public long numberOfWays(String s) {
        long zero=0,one=0,zo=0,oz=0,ways=0;
        int n=s.length();
        for(int i=0;i<n;i++){
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