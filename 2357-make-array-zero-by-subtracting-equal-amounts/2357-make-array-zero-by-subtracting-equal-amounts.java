class Solution {
    public int minimumOperations(int[] nums) {
        HashSet<Integer> li=new HashSet<>();
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=0){
                li.add(nums[i]);
            }
        }
        return li.size();
    }
}