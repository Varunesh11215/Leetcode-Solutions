class Solution {
    public int[] platesBetweenCandles(String st, int[][] queries) {
        int n=st.length();
        int pre[]=new int[n+1];
        int left[]=new int[n];
        int right[]=new int[n];
        int c=-1;
        for(int i=0;i<n;i++){
            pre[i+1]=pre[i];
            if(st.charAt(i)=='*'){
                pre[i+1]++;
            }
            if(st.charAt(i)=='|'){
                c=i;
            }
            left[i]=c;
        }
        c=-1;
        for(int i=n-1;i>=0;i--) {
            if(st.charAt(i)=='|'){
                c=i;
            }
            right[i]=c;
        }
        int res[]=new int[queries.length];
        int i=0;
        for(int arr[]:queries){
            int s=right[arr[0]];
            int e=left[arr[1]];
            if (s==-1||e==-1||s>=e){
                res[i++]=0;
            } 
            else{
                res[i++]=pre[e]-pre[s];
            }
        }
        return res;
    }
}