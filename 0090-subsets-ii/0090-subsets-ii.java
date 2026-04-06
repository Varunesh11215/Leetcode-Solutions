class Solution {
    public static void posss(List<List<Integer>> list,List<Integer>li,int i,int nums[]){
        if(i==nums.length){
            List <Integer> tem=new ArrayList<>(li);
            Collections.sort(tem);
            if(!list.contains(tem)){
                list.add(new ArrayList<>(tem));
            }
            return;
        }
        li.add(nums[i]);
        posss(list,li,i+1,nums);
        li.remove(li.size()-1);
        posss(list,li,i+1,nums);
    }
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> list=new ArrayList<>();
        List<Integer> li=new ArrayList<>();
        posss(list,li,0,nums);
        return list;
    }
}