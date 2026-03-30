class Solution {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> res = new ArrayList<>();
        function(1, n, k, res, new ArrayList<>());
        return res;
    }
    public void function(int start, int n, int k,List<List<Integer>> res,List<Integer> list) {
        if (list.size() == k) {
            res.add(new ArrayList<>(list));
            return;
        }
        for (int i = start; i <= n; i++) {
            list.add(i);
            function(i + 1, n, k, res, list);
            list.remove(list.size() - 1);
        }
    }
}