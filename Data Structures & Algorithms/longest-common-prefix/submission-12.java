class Solution {
    public String longestCommonPrefix(String[] strs) {
        String t = "";
        int minLength = Integer.MAX_VALUE;
        for(String s : strs){
            int len = s.length();
            minLength = Math.min(len, minLength);
        }

        for(int i=0;i<minLength;i++){
            char ch = strs[0].charAt(i);
            for(int j=1;j<strs.length;j++){
                if(ch == strs[j].charAt(i)){
                    continue;
                }
                else{
                    return t;
                }
            }
            t = t + ch;
        }

        return t;
    }
}