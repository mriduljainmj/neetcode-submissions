class Solution {
    public String longestCommonPrefix(String[] strs) {
        String ans = "";
        boolean newCheck = false;
        for(int i=0;i<strs[0].length();i++){
            Character check = strs[0].charAt(i);
            for(int j=1;j<strs.length;j++){

                if(strs[j].length()==0 || i>=strs[j].length() || check != strs[j].charAt(i) ){
                    newCheck = true;
                    break;
                }
            }
            if(newCheck){
                break;
            }
            ans = ans + strs[0].charAt(i);
        }
        return ans;
    }
}