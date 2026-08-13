class Solution {
    public int leastInterval(char[] tasks, int n) {
        int []freq=new int[26];
        for(char task:tasks){
            freq[task-'A']++;
        }
        Arrays.sort(freq);
        int m=freq[25]-1;
        int v=m*n;
        for(int i=24;i>=0;i--){
            v-=Math.min(m,freq[i]);
        }
        return v<0? tasks.length: tasks.length+v;
    }
}