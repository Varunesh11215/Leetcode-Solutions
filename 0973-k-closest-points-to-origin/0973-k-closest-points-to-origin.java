class Solution {
    public int[][] kClosest(int[][] res, int k) {
        int point[][]=new int[k][2];
        for(int i=0;i<res.length;i++){
            int d1=(res[i][0]*res[i][0])+(res[i][1]*res[i][1]);
            for(int j=i+1;j<res.length;j++){
                int d2=(res[j][0]*res[j][0])+(res[j][1]*res[j][1]);
                if(d1>d2){
                    int t=res[i][0];
                    res[i][0]=res[j][0];
                    res[j][0]=t;
                    t=res[i][1];
                    res[i][1]=res[j][1];
                    res[j][1]=t;
                    d1=d2;
                }
            }
        }
        for(int i=0;i<k;i++){
            point[i][0]=res[i][0];
            point[i][1]=res[i][1];
        }
        return point;
    }
}