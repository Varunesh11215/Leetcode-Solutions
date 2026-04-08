class Solution {
    public int maxProfit(int[] prices) {
        int profit=0,i;
        int buy=prices[0];
        int len=prices.length;
        for(i=0;i<len;i++){
            if(buy>prices[i]){
                buy=prices[i];
            }
            else{
                if(prices[i]-buy>profit){
                    profit=prices[i]-buy;
                }
            }
        }
        return profit;
    }
}