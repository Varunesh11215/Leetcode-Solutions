class Solution {
    public boolean isValidSudoku(char[][] board) {
        int n=9;
        boolean col[][]=new boolean[n][n];
        boolean row[][]=new boolean[n][n];
        boolean box[][]=new boolean[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(board[i][j]=='.'){
                    continue;
                }
                int boxnum=(i/3)+(j/3)*3;
                int num=board[i][j]-'0'-1;
                if(col[j][num] || row[i][num] ||box[boxnum][num]){
                    return false;
                }
                col[j][num]=true;
                row[i][num]=true;
                box[boxnum][num]=true;
            
            }
        }
        return true;
    }
}