class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> set=new HashSet<>();
        for(int n:nums){
            set.add(n);
        }
        int l=0;
        for(int num:set){
            if(!set.contains(num-1)){
                int length=1;
                int next=num+1;
                while(set.contains(next)){
                    next++;
                    length++;
                }
                l=Math.max(l,length);
            }
        }
        return l;
    }
}