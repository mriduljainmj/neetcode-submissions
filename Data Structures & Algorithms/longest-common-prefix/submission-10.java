class Solution {
    public String longestCommonPrefix(String[] strs) {
        String ans = "";
        boolean check = false;
        if(strs[0]== ""){
            return "";
        }
        for(int i=0;i<strs[0].length();i++){
            char wordToCheck = strs[0].charAt(i);

            for(int j = 1;j<strs.length;j++){

                if(strs[j].length()==0){
                    return "";
                }

                if(i >= strs[j].length() || strs[j].charAt(i) != wordToCheck){
                    check = true;
                }
            }
            if(check){
                return ans;
            }
            else{
                ans = ans + wordToCheck;
            }

        }

        return ans;
    }
}