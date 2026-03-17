class Solution {
    public int findMinArrowShots(int[][] points) {
        int len=points.length;
        Arrays.sort(points,(a,b)->Integer.compare(a[1],b[1]));
        boolean check[]=new boolean[len];
        int count=0;
        for(int i=0;i<len;i++){
            int s=points[i][0];
            int e=points[i][1];
            if(check[i]==false){
                check[i]=true;
                count++;
                for(int j=i+1;j<len;j++){
                    if(check[j]==false){
                        int s1=points[j][0];
                        int e1=points[j][1];
                        if (s1 <= e){
                            check[j]=true;
                        }
                        else{
                            break;
                        }
                    }
                }
            }
        }
        return count;
    }
}