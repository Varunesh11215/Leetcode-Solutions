class Solution {
    public boolean containsDuplicate(int[] nums) {
        int len=nums.length;
        Arrays.sort(nums);
        for(int i=1;i<len;i++){
            if(nums[i]==nums[i-1]){
                return true;
            }
        }
        return false;
    }
}