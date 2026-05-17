class Solution {
    public String simplifyPath(String path) {
        Stack<String> stack = new Stack<>();
        String[] pathArr = path.split("/");
        for(String s : pathArr){
            if(s.equals("..") && stack.isEmpty()){
                continue;
            }
            else if(s.equals("..") && !stack.isEmpty()){
                stack.pop();
            }
            else if((s.equals(".") || s.equals(""))){
               continue;
            }
            else{
                stack.push(s);
            }
        }

        StringBuilder ans = new StringBuilder();  
        for (String s : stack) {
            ans.append("/").append(s);
        }

        return ans.length() == 0 ? "/" : ans.toString();

        
    }
}