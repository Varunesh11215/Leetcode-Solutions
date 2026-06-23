class Solution {
    public int findPoisonedDuration(int[] t, int d) {
        int sum=0;
        int len=t.length;
        for(int i=0;i<len-1;i++){
            if(t[i+1]-t[i]>d){
                sum+=d;
            }
            else{
                sum+=t[i+1]-t[i];
            }
        }
        sum+=d;
        return sum;
    }
}