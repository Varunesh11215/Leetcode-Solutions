class Solution {
    public int[] twoSum(int[] nums, int target) {
        int ans[]=new int[2];
        Map <Integer,Integer> arr=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(arr.containsKey(target-nums[i])){
                ans[0]=arr.get(target-nums[i]);
                ans[1]=i;
                break;
            }
            arr.put(nums[i],i);
        }
        return ans;
    }
}