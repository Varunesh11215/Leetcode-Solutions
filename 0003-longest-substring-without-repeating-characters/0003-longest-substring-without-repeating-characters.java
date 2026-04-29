class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> string=new HashSet<>();
        int j=0;
        int count=0;
        int m=0;
        for(int i=0;i<s.length();i++){
            if(!string.contains(s.charAt(i))){
                string.add(s.charAt(i));
                count++;
                m=Math.max(count,m);
            }
            else{
                string.remove(s.charAt(j));
                count--;
                i--;
                j++;
            }
        }
        return m;
    }
}