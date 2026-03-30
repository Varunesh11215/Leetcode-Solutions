class Solution {
    public static void posss(int len,List<List<Integer>> list,List<Integer>li,int i,int nums[]){
        if(i==nums.length){
            list.add(new ArrayList<>(li));
            return;
        }
        li.add(nums[i]);
        posss(len,list,li,i+1,nums);
        li.remove(li.size()-1);
        posss(len,list,li,i+1,nums);
    }
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> list=new ArrayList<>();
        int len=nums.length;
        List<Integer> li=new ArrayList<>();
        posss(len,list,li,0,nums);
        return list;
    }
}