class Solution {
    public int minimumOperations(int[] nums) {
        int c=0;
        int len=nums.length;
        Arrays.sort(nums);
        for(int i=0;i<len;i++){
            if(nums[i]==0){
                continue;
            }
            int v=nums[i];
            nums[i]-=v;
            int j=i+1;
            while(j<len){
                nums[j++]-=v;
            }
            c++;
        }
        return c;
    }
}