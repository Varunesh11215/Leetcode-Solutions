class Solution {
    public int[] separateDigits(int[] nums) {
        String str="";
        for(int i=0;i<nums.length;i++){
            str+=nums[i];
        }
        int len=str.length();
        int arr[]=new int[len];
        for(int i=0;i<len;i++){
            arr[i]=str.charAt(i)-'0';
        }
        return arr;
    }
}