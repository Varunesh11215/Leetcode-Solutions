class Solution {
    public int orangesRotting(int[][] grid) {
        Queue<int[]>li=new LinkedList<>();
        int r=grid.length;
        int c=grid[0].length;
        int oranges=0;
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                if(grid[i][j]==2){
                    int arr[]=new int[2];
                    arr[0]=i;
                    arr[1]=j;
                    li.add(arr);
                }
                else if(grid[i][j]==1){
                    oranges++;
                }
            }
        }
        int res=0;
        if(oranges==0){
            return res;
        }
        while(li.size()>=1){
            res++;
            int n=li.size();
            for(int k=0;k<n;k++){
                int arr[]=li.poll();
                int i=arr[0];
                int j=arr[1];
                if(i+1<r && grid[i+1][j]==1){
                    li.add(new int[]{i+1,j});
                    grid[i+1][j]=2;
                    oranges--;
                }
                if(i-1>=0 && grid[i-1][j]==1){
                    li.add(new int[]{i-1,j});
                    grid[i-1][j]=2;
                    oranges--;
                }
                if(j-1>=0 &&grid[i][j-1]==1){
                    li.add(new int[]{i,j-1});
                    grid[i][j-1]=2;
                    oranges--;
                }
                if(j+1<c  &&grid[i][j+1]==1){
                    li.add(new int[]{i,j+1});
                    grid[i][j+1]=2;
                    oranges--;
                }
            }
            if(oranges==0){
                return res;
            }
        }
        return -1;
    }
}