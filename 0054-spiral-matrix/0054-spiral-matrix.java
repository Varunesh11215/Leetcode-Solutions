class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        ArrayList<Integer> li=new ArrayList<>();
        int r=matrix.length;
        int c=matrix[0].length;
        boolean visited[][]=new boolean[r][c];
        int si=0;
        int sj=0;
        while(true){
                while(sj<c){
                    if(visited[si][sj]){
                        sj--;
                        break;
                    }
                    visited[si][sj]=true;
                    li.add(matrix[si][sj]);
                    sj++;
                }
                if(sj==c){
                    sj--;
                }
                si++;
                while(si<r){
                    if(visited[si][sj]){
                        si--;
                        break;
                    }
                    visited[si][sj]=true;
                    li.add(matrix[si][sj]);
                    si++;
                }
                if(si==r){
                    si--;
                }
                sj--;
                while(sj>=0){
                    if(visited[si][sj]){
                        sj++;
                        break;
                    }
                    visited[si][sj]=true;
                    li.add(matrix[si][sj]);
                    sj--;
                }
                if(sj==-1){
                    sj++;
                }
                si--;
                while(si>=0){
                    if(visited[si][sj]){
                        si++;
                        break;
                    }
                    visited[si][sj]=true;
                    li.add(matrix[si][sj]);
                    si--;
                }
                if(si==-1){
                    si++;
                }
                sj++;
                if(li.size()==r*c){
                    break;
                }
            }
            return li;
    }
}