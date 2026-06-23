class Solution {
    public int findLHS(int[] nums) {
        Arrays.sort(nums);
        int ln=0;
        for(int i=0;i<nums.length;i++){
            for(int j=nums.length-1;j>=0;j--){
                if(nums[i]==nums[j]-1){
                    ln=Math.max(ln,j-i+1);
                }
            }
        }
        return ln;
    }
}