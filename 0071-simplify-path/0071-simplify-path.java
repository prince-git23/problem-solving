class Solution {
    public String simplifyPath(String path) {
        Stack<String> stack = new Stack<>();
        String dirs[] = path.split("/");
        for(String dir : dirs){
            if(dir == "" || dir.equals(".")){
                continue;
            }
            else if(dir.equals("..")){
                if(!stack.isEmpty())
                    stack.pop();
            }
            else{
                stack.push(dir);
            }
        }
        if(stack.isEmpty())
            return "/";
        StringBuilder sb = new StringBuilder();
        for(String dir : stack){
            sb.append("/" + dir);
        }
        return sb.toString();
    }
}