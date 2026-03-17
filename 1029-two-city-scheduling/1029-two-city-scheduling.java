class Solution {
    public int twoCitySchedCost(int[][] costs) {
        int cost=0;
        int len=costs.length;
        for(int i=0;i<len;i++){
            int min=i;
            for(int j=i+1;j<len;j++){
                int diff1=costs[j][0]-costs[j][1];
                int diff2=costs[min][0]-costs[min][1];
                if(diff1<diff2){
                    min=j;
                }
            }
            int t1=costs[i][0];
            int t2=costs[i][1];
            costs[i][0]=costs[min][0];
            costs[i][1]=costs[min][1];
            costs[min][0]=t1;
            costs[min][1]=t2;
        }
        for(int i=0;i<len/2;i++){
            cost+=costs[i][0];
        }
        for(int j=len/2;j<len;j++){
            cost+=costs[j][1];
        }
        return cost;
    }
}