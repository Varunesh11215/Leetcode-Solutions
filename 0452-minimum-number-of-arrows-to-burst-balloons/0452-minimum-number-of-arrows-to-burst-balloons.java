class Solution {
    public int findMinArrowShots(int[][] points) {
        int len=points.length;
        Arrays.sort(points,(a,b)->Integer.compare(a[1],b[1]));
        int count=1;
        int e=points[0][1];
        for(int i=1;i<len;i++){
            int s1=points[i][0];
            if (s1 <= e){
                continue;
            }
            else{
                e=points[i][1];
                count++;
            }
        }
        return count;
    }
}