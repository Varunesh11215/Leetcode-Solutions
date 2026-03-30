class Solution {
    public int maxSum(int[] nums) {
        Arrays.sort(nums);
        int len=nums.length;
        int sum=nums[len-1];
        for(int i=len-2;i>=0;i--){
            if(nums[i]<=0){
                break;
            }
            if(nums[i]!=nums[i+1]){
                sum+=nums[i];
            }
        }
        return sum;
    }
}