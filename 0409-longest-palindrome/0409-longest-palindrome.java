class Solution {
    public int longestPalindrome(String s) {
        int arr[]=new int[52];
        for(char ch:s.toCharArray()){
            if(ch-'a'<0){
                arr[ch-'A'+26]++;
            }
            else{
                arr[ch-'a']++;
            }
        }
        int odd=0;
        int len=0;
        for(int i=0;i<52;i++){
            if(arr[i]%2==0){
                len+=arr[i];
            }
            else{
                len+=arr[i]-1;
                odd=1;
            }
        }
        return len+odd;
    }
}