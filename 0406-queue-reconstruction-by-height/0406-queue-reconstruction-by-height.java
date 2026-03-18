class Solution {
    public int[][] reconstructQueue(int[][] people) {
        Arrays.sort(people,(a,b)->{
            if(a[0]==b[0]){
                return a[1]-b[1];
            }
            return b[0]-a[0];
        });
        int len=people.length;
        for(int i=0;i<len;i++){
            int target=people[i][1];
            int t2=people[i][0];
            if(i>target){
                for(int j=i-1;j>=target;j--){
                    people[j+1][1]=people[j][1];
                    people[j+1][0]=people[j][0];
                }
            }
            people[target][0]=t2;
            people[target][1]=target;
        }
        return people;
    }
}