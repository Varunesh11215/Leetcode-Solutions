class Solution {
    public int largestInteger(int num) {
        String str=String.valueOf(num);
        int len=str.length();
        int arr[]=new int[len];
        for(int i=0;i<str.length();i++){
            arr[i]=str.charAt(i)-'0';
        }
        for(int i=0;i<len;i++){
            int o=arr[i]%2;
            for(int j=i+1;j<len;j++){
                if(arr[j]%2==o){
                    if(arr[j]>arr[i]){
                        int t=arr[j];
                        arr[j]=arr[i];
                        arr[i]=t;
                    }
                }
            }
        }
        int res=0;
        for(int i=0;i<len;i++){
            res*=10;
            res+=arr[i];
        }
        return res;
    }
}