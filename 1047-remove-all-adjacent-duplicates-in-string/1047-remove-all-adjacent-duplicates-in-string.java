class Solution {
    public String removeDuplicates(String s) {
        StringBuilder sb = new StringBuilder();
        Stack<Character> stack = new Stack<>();
        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            if(!stack.isEmpty() && stack.peek()==c){
                stack.pop();
                sb.deleteCharAt(sb.length()-1);
            }
            else{

            stack.push(c);
            sb.append(c);
            }
        }
        return sb.toString();
    }
}