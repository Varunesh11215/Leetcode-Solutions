class Solution {
    public int[][] kClosest(int[][] res, int k) {
        int point[][]=new int[k][2];
        PriorityQueue<int[]>pq=new PriorityQueue<>((a,b)->a[0]-b[0]);
        for(int i=0;i<res.length;i++){
            int d1=(res[i][0]*res[i][0])+(res[i][1]*res[i][1]);
            int arr[]=new int[3];
            arr[0]=d1;
            arr[1]=res[i][0];
            arr[2]=res[i][1];
            pq.add(arr);
        }
        for(int i=0;i<k;i++){
            int arr[]=pq.poll();
            point[i][0]=arr[1];
            point[i][1]=arr[2];
        }
        return point;
    }
}