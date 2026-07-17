class Solution {
    public boolean canMakeSquare(char[][] grid) {
        int r=grid.length;
        int c=grid[0].length;
        for(int i=0;i<r-1;i++){
            for(int j=0;j<c-1;j++){
                char ch=grid[i][j];
                int cb=0;
                int cw=0;
                if(grid[i][j]=='B'){
                    cb++;
                }
                else{
                    cw++;
                }
                if('B'==grid[i+1][j]){
                    cb++;
                }
                else{
                    cw++;
                }
                if('B'==grid[i][j+1]){
                    cb++;
                }
                else{
                    cw++;
                }
                if('B'==grid[i+1][j+1]){
                    cb++;
                }
                else{
                    cw++;
                }
                if(cb>=3||cw>=3){
                    return true;
                }
            }
        }
        return false;
    }
}