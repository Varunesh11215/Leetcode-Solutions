class Solution {
    public int closestTarget(String[] words, String target, int startindex) {
        int n=words.length;
        int fc=0;
        if(words[startindex].equals(target)){
            return 0;
        }
        int i=(startindex+1)%n;
        fc++;
        while(i!=startindex){
            if(words[i].equals(target)){
                break;
            }
            fc++;
            i=(i+1)%n;
        }
        int bc=0;
        i=(startindex-1+n)%n;
        bc++;
        while(i!=startindex){
            if(words[i].equals(target)){
                break;
            }
            bc++;
            i=(i-1+n)%n;
        }
        int res=Math.min(fc,bc);
        if(res==n){
            return -1;
        }
        return res;
    }
}