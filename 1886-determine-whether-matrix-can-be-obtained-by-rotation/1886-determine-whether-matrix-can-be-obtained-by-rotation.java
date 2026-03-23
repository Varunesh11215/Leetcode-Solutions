class Solution {
    public boolean findRotation(int[][] mat, int[][] target) {
        int len = mat.length;

        boolean flg1 = true;
        boolean flg2 = true;
        boolean flg3 = true;
        boolean flg4 = true;
        for(int i = 0;i < len;i++){
            for(int j = 0;j < len;j++){
                if(mat[i][j] != target[i][j]) flg1 = false;
                if(mat[i][j] != target[j][len-i-1]) flg2 = false;
                if(mat[i][j] != target[len-1-i][len-1-j]) flg3 = false;
                if(mat[i][j] != target[len-1-j][i]) flg4 = false;
                
                if(!flg1 && !flg2 && !flg3 && !flg4) return false;
            }
        }
        
        return true;
    }
}