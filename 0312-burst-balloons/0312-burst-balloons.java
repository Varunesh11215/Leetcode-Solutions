class Solution {
    public static int check(int arr[],int i,int j,int dp[][]){
        if(i>j){
            dp[i][j]=0;
            return 0;
        }
        int res=0;
        if(dp[i][j]!=-1){
            return dp[i][j];
        }
        for(int k=i;k<j+1;k++){
            res=Math.max(res,arr[i-1]*arr[k]*arr[j+1]+check(arr,i,k-1,dp)+check(arr,k+1,j,dp));
        }
        dp[i][j]=res;
        return res;
    }
    public int maxCoins(int[] nums) {
        int n=nums.length;
        int arr[]=new int[n+2];
        int dp[][]=new int[n+2][n+2];
        for(int i = 0; i < n + 2; i++) {
            Arrays.fill(dp[i], -1);
        }
        arr[0]=1;
        arr[n+1]=1;
        for(int i=0;i<n;i++){
            arr[i+1]=nums[i];
        }
        return check(arr,1,n,dp);
    }
}