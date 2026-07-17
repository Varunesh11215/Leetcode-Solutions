class Solution {
    public boolean canMakeSquare(char[][] grid) {
        int r=grid.length;
        int c=grid[0].length;
        for(int i=0;i<r-1;i++){
            for(int j=0;j<c-1;j++){
                char ch=grid[i][j];
                int count=1;
                if(ch==grid[i+1][j]){
                    count++;
                }
                if(ch==grid[i][j+1]){
                    count++;
                }
                if(ch==grid[i+1][j+1]){
                    count++;
                }
                if(count>=3){
                    return true;
                }
            }
        }
        for(int i=r-1;i>0;i--){
            for(int j=c-1;j>0;j--){
                char ch=grid[i][j];
                int count=1;
                if(ch==grid[i-1][j]){
                    count++;
                }
                if(ch==grid[i][j-1]){
                    count++;
                }
                if(ch==grid[i-1][j-1]){
                    count++;
                }
                if(count>=3){
                    return true;
                }
            }
        }
        return false;
    }
}