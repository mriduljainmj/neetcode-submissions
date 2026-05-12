class Solution {
    public String longestCommonPrefix(String[] strs) {
        String ans = "";
        int minStringLength = Integer.MAX_VALUE;
        for(int i=0;i<strs.length;i++){
            if(strs[i].length()<minStringLength){
                minStringLength = strs[i].length();
            }
        }

        for(int i=0;i<minStringLength;i++){
            char check = strs[0].charAt(i);
            for(int j=1;j<strs.length;j++){
                if(check==strs[j].charAt(i)){
                    continue;
                }
                else{
                    return ans;
                }
            }
            ans = ans+check;
        }

        return ans;

    }
}