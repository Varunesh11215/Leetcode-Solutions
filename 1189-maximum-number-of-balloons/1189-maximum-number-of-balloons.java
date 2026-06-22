class Solution {
    public int maxNumberOfBalloons(String text) {
        int arr[]=new int [5];
        int len=text.length();
        int o=0;
        int l=0;
        for(int i=0;i<len;i++){
            if(text.charAt(i)=='a'){
                arr[0]+=1;
            }
            else if(text.charAt(i)=='b'){
                arr[1]+=1;
            }
            else if(text.charAt(i)=='o'){
                o++;
            }
            else if(text.charAt(i)=='l'){
                l++;
            }
            else if(text.charAt(i)=='n'){
                arr[2]+=1;
            }
            if(o==2){
                arr[3]+=1;
                o=0;
            }
            if(l==2){
                arr[4]+=1;
                l=0;
            }
        }
        int min=100000000;
        for(int i=0;i<5;i++){
            min=Math.min(arr[i],min);
        }
        return min;
    }
}