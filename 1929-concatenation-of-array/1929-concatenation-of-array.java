class Solution {
    public int[] getConcatenation(int[] nums) {
        int len=nums.length;
        int arr[]=new int[len+len];
        int k=0;
        for(int i=0;i<len+len;i++){
            if(k==len){
                k=0;
            }
            arr[i]=nums[k++];
        }
        return arr;
    }
}