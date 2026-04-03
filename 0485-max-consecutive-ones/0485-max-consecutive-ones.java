class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int n=nums.length;
        int count=0;
        int m=0;
        for(int i=0;i<n;i++){
            if(nums[i]==1){
                count++;
                continue;
            }
            if(count>m){
                m=count;
            }
            count=0;
        }
        if(count>m){
            m=count;
        }
        return m;
    }
}