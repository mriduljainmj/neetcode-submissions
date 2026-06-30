class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> res = new ArrayList<String>();
        StringBuilder stack = new StringBuilder();
        generate(0,0,n, res, stack);
        return res;
    }

    private void generate(int open, int close, int n, List<String> res, StringBuilder stack){
        if(open==close && open==n){
            res.add(stack.toString());
            return;
        }
        if(open<n){
            stack.append('(');
            generate(open+1, close, n, res, stack);
            stack.deleteCharAt(stack.length()-1);
        }

        if(close < open){
            stack.append(')');
            generate(open, close+1, n, res, stack);
            stack.deleteCharAt(stack.length()-1);
    }
    }
}
