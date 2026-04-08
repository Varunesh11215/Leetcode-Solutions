class Solution{
    public void moveZeroes(int[] nums){
        int len=nums.length;
        int j=0,i;
        for(i=0;i<len;i++){
            if(nums[i]!=0){
                nums[j]=nums[i];
                j++;
            }
        }
        for(j=j;j<len;j++){
            nums[j]=0;
        }
    }
}