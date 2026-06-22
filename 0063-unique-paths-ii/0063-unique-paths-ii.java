class Solution {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int r=obstacleGrid.length;
        int c=obstacleGrid[0].length;
        if(r==1||c==1){
            for(int i=0;i<r;i++){
                for(int j=0;j<c;j++){
                    if(obstacleGrid[i][j]==1){
                        return 0;
                    }
                }
            }
            return 1;
        }
        if(obstacleGrid[0][0]==1||obstacleGrid[r-1][c-1]==1){
            return 0;
        }
        for(int i=0;i<r;i++){
            if(obstacleGrid[i][0]==1){
                break;
            }
            obstacleGrid[i][0]=-1;
        }
        for(int j=0;j<c;j++){
            if(obstacleGrid[0][j]==1){
                break;
            }
            obstacleGrid[0][j]=-1;
        }
        for(int i=1;i<r;i++){
            for(int j=1;j<c;j++){
                if(obstacleGrid[i][j]==1){
                    obstacleGrid[i][j]=0;
                    continue;
                }

                int top = obstacleGrid[i-1][j];
                int left = obstacleGrid[i][j-1];

                if(top < 0)
                    obstacleGrid[i][j] += top;

                if(left < 0)
                    obstacleGrid[i][j] += left;
            }
        }
        int res=Math.abs(obstacleGrid[r-1][c-1]);
        return res;
    }
}