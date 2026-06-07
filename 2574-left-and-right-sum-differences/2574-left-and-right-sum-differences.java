class Solution {
    public int[] leftRightDifference(int[] nums) {
        int len=nums.length;
        int left[]=new int[len];
        int right[]=new int[len];
        int sum=0;
        for(int i=0;i<len;i++){
            left[i]=sum;
            sum+=nums[i];
        }
        sum=0;
        for(int i=len-1;i>=0;i--){
            right[i]=Math.abs(sum-left[i]);
            sum+=nums[i];
        }
        return right;
    }
}