class Solution {
    public static void poss(List<List<Integer>>list,List<Integer>li,int k,int nums[],int i){
        if(i==nums.length){
            return;
        }
        if(li.size()==k){
            list.add(new ArrayList<>(li));
            return;
        }
        li.add(nums[i]);
        poss(list,li,k,nums,i+1);
        li.remove(li.size()-1);
        poss(list,li,k,nums,i+1);
    }
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>>list=new ArrayList<>();
        List<Integer> li=new ArrayList<>();
        int nums[]=new int[n+1];
        for(int i=0;i<=n;i++){
            nums[i]=i+1;
        }
        poss(list,li,k,nums,0);
        return list;
    }
}