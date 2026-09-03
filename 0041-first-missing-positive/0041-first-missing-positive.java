class Solution {
    public int firstMissingPositive(int[] nums) {
        int n = nums.length;
        int i=0;

        while(i<n){
            if(nums[i]>0 && nums[i]<=n && nums[nums[i]-1]!=nums[i]){
                int t=nums[i];
                nums[i]=nums[t-1];
                nums[t-1]=t;
            }else{
                i++;
            }
        }

        for(int j=0 ; j<n ; j++){
            if(nums[j] != j+1){
                return j+1;
            }
        }
        return n+1;
    }
}