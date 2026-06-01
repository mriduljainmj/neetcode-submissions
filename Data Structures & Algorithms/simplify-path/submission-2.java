class Solution {
    public String simplifyPath(String path) {
        Stack<String> stack = new Stack<String>();
        String[] arr = path.split("/");
        for(String s : arr){
            if(s.equals("..") && !stack.isEmpty()){
                stack.pop();
            }
            else if(s.equals("..") && stack.isEmpty()){
                continue;
            }
            else if((s.equals(".") || s.equals(""))){
               continue;
            }
            else{
                stack.push(s);
            }
            
        }

        StringBuilder st = new StringBuilder();
        for(String s : stack){
            st.append("/").append(s);
        }

        return st.length() == 0 ? "/" : st.toString();
    }
}