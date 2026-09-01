class Solution {
    public boolean canFinish(int v, int[][] prerequisites) {
        ArrayList<ArrayList<Integer>> li=new ArrayList<>();
        for(int i=0;i<v;i++){
            li.add(new ArrayList<>());
        }
        int n=prerequisites.length;
        int deg[]=new int[v];
        for(int i=0;i<n;i++){
            li.get(prerequisites[i][1]).add(prerequisites[i][0]);
            deg[prerequisites[i][0]]++;
        }
        int c=0;
        Queue<Integer> q =new LinkedList<>();
        for(int i=0;i<v;i++){
            if(deg[i]==0){
                q.add(i);
            }
        }
        int count=0;
        while(!q.isEmpty()){
            int k=q.poll();
            count++;
            for(int i:li.get(k)){
                deg[i]--;
                if(deg[i]==0){
                    q.add(i);
                }
            }
        }
        return count==v;

    }
}