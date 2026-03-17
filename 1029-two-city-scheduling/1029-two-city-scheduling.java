class Solution {
    public int twoCitySchedCost(int[][] costs) {
        Arrays.sort(costs, (a,b) -> (a[1]-a[0]) - (b[1]-b[0]));
        int cost=0;
        int n=costs.length;
        for(int i=0;i<n/2;i++){
            cost+=costs[i][1];    
        }
        for(int i=n/2;i<n;i++){
            cost+=costs[i][0];    
        }
        return cost;
    }
}