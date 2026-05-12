class Solution {
    public boolean isValid(String s) {
         if(s.length()<2){
            return false;
        }
        char[] charArray = s.toCharArray();
        Stack<Character> stack = new Stack<>();
        HashMap<Character, Character> hashmap = new HashMap<>();
        hashmap.put('}','{');
        hashmap.put(')','(');
        hashmap.put(']','[');

        for(int i=0;i<charArray.length;i++){
            if(hashmap.containsKey(charArray[i]) && !stack.isEmpty()){
                Character temp = hashmap.get(charArray[i]);
                if(temp==stack.pop()){
                    continue;
                }
                else{
                    return false;
                }
            }
            else{
                stack.push(charArray[i]);
            }
        }
        
        if(stack.isEmpty()){
            return true;
        }
    return false;

    }
}
