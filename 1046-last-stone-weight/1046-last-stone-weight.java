class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> li=new PriorityQueue<>(Collections.reverseOrder());
        int n=stones.length;
        if(n==1){
            return stones[0];
        }
        for(int i=0;i<n;i++){
            li.add(stones[i]);
        }
        while(li.size()>1){
            int f=li.poll();
            int l=li.poll();
            li.add(f-l);
        }
        return li.poll();
    }
}