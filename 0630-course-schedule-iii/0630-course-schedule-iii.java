class Solution {
    public int scheduleCourse(int[][] courses) {
        PriorityQueue<Integer> pq=new PriorityQueue<>(Collections.reverseOrder());
        Arrays.sort(courses,(a,b)->{
            return a[1]-b[1];
        });
        int n=courses.length;
        int d=0;
        int res=0;
        int c=0;
        for(int i=0;i<n;i++){
            d+=courses[i][0];
            pq.add(courses[i][0]);
            res++;
            if(d>courses[i][1]){
                d-=pq.poll();
                res--;
            }
        }
        return res;
    }
}