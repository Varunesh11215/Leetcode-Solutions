class Solution {
    public int[] findOrder(int v, int[][] prerequisites) {
        ArrayList<ArrayList<Integer>> li=new ArrayList<>();
        for(int i=0;i<v;i++){
            li.add(new ArrayList<>());
        }
        int n=prerequisites.length;
        for(int i=0;i<n;i++){
            li.get(prerequisites[i][1]).add(prerequisites[i][0]);
        }
        int deg[]=new int[v];
        for(int i=0;i<v;i++){
            for(int j:li.get(i)){
                deg[j]++;
            }
        }
        Queue<Integer> q=new LinkedList<>();
        for(int i=0;i<v;i++){
            if(deg[i]==0){
                q.add(i);
            }
        }
        ArrayList<Integer> res=new ArrayList<>();
        int k=0;
        while(!q.isEmpty()){
            k=q.poll();
            res.add(k);
            for(int i:li.get(k)){
                deg[i]--;
                if(deg[i]==0){
                    q.add(i);
                }
            }
            k++;
        }
        if(res.size()!=v){
            return new int[0];
        }
        int cources[]=new int[res.size()];
        k=0;
        for(int i:res){
            cources[k++]=i;
        }
        return cources;
    }
}