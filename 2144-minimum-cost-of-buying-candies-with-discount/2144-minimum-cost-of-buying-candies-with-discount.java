class Solution {
    public int minimumCost(int[] cost) {
        Arrays.sort(cost);
        int len=cost.length;
        int sum=0;
        int l=2;
        for(int i=len-1;i>=0;i--){
            if(l==0){
                l=2;
                continue;
            }
            l--;
            sum+=cost[i];
        }
        return sum;
    }
}