class Solution {
    public boolean canFinish(int v, int[][] pre) {
        ArrayList<ArrayList<Integer>> li=new ArrayList<>();
        int n=pre.length;
        for(int i=0;i<v;i++){
            li.add(new ArrayList<>());
        }
        int deg[]=new int[v];
        for(int i=0;i<n;i++){
            li.get(pre[i][1]).add(pre[i][0]);
            deg[pre[i][0]]++;
        }
        Queue<Integer> q=new LinkedList<>();
        int c=0;
        for(int i=0;i<v;i++){
            if(deg[i]==0){
                q.add(i);
            }
        }
        while(!q.isEmpty()){
            int k=q.poll();
            c++;
            for(int i:li.get(k)){
                deg[i]--;
                if(deg[i]==0){
                    q.add(i);
                }
            }
        }
        return c==v;
    }
}