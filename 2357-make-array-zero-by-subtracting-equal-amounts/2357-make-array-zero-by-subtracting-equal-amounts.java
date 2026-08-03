class Solution {
    public int minimumOperations(int[] nums) {
        HashSet<Integer> li=new HashSet<>();
        int len=nums.length;
        for(int i=0;i<len;i++){
            if(nums[i]!=0){
                li.add(nums[i]);
            }
        }
        return li.size();
    }
}