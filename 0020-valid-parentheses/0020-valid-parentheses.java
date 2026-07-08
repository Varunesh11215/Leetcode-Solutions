class Solution {
    public boolean isValid(String s) {
        Stack<Character> li=new Stack<>();
        for(char c:s.toCharArray()){
            if(c=='('){
                li.push(')');
            }
            else if(c=='{'){
                li.push('}');
            }
            else if(c=='['){
                li.push(']');
            }
            else if(li.isEmpty()||li.pop()!=c){
                return false;
            }
        }
        return li.isEmpty();
    }
}