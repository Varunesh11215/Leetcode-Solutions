class Solution {
    public int maxProfit(int[] prices) {
        int len=prices.length;
        int s=prices[0];
        int sum=0;
        for(int i=1;i<len;i++){
            if(s>prices[i]){
                s=prices[i];
                continue;
            }
            int num2=prices[i];
            for(int j=i;j<len;j++){
                if(num2<prices[j]){
                    i=j;
                    num2=prices[i];
                }
                else{
                    sum+=num2-s;
                    s=prices[j];
                    break;
                }
            }
        }
        return sum;
    }
}