class Solution {
    public static boolean check(int i,int j,char board[][],boolean visited[][],int r,int c,int pos,String s){
        if(i<0||j<0||i>=r||j>=c||visited[i][j]){
            return false;
        }
        if(s.charAt(pos)==board[i][j]){
            pos++;
            visited[i][j]=true;
            if(pos==s.length()){
                return true;
            }
        }
        else{
            return false;
        }
        
        boolean left = check(i+1,j,board,visited,r,c,pos,s);
        boolean right = check(i-1,j,board,visited,r,c,pos,s);
        boolean top = check(i,j+1,board,visited,r,c,pos,s);
        boolean down = check(i,j-1,board,visited,r,c,pos,s);

        visited[i][j] = false;
        return left || right || top || down;
    }
    public boolean exist(char[][] board, String word) {
        int r=board.length;
        int c=board[0].length;
        int pos=0;
        boolean visited[][]=new boolean[r][c];
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                if(word.charAt(pos)==board[i][j]){
                    if(check(i,j,board,visited,r,c,pos,word)){
                        return true;
                    }
                }
            }
        }
        return false;
    }
}