class Solution {
    public String longestCommonPrefix(String[] strs) {
        StringBuilder s = new StringBuilder();
        int minLengthString = Integer.MAX_VALUE;
        for(String t : strs){
            int len = t.length();
            minLengthString = Math.min(len, minLengthString);
        }

        for(int i=0;i<minLengthString;i++){
            char ch = strs[0].charAt(i);
            for(int j=1;j<strs.length;j++){
                if(ch==strs[j].charAt(i)){
                    continue;
                }
                else{
                    return s.toString();
                }
            }
            s.append(ch);
        }

        return s.toString();
    }
}