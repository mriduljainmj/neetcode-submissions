class Solution {
    public boolean isValid(String s) {
        HashMap<Character, Character> map  = new HashMap<>();
        map.put('}','{');
        map.put(']','[');
        map.put(')','(');
        Stack<Character> stack  = new Stack<>();
        for(int i =0;i< s.length(); i++){
            if(map.containsKey(s.charAt(i)) && !stack.isEmpty() && stack.peek()==map.get(s.charAt(i))){
                stack.pop();
            }
            else{
                stack.push(s.charAt(i));
            }
        }

        if(!stack.isEmpty()){
            return false;
        }

        return true;
        
    }
}
