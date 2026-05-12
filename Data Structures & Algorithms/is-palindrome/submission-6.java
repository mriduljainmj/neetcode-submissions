class Solution {
    public boolean isPalindrome(String s) {
        String newString = s.replaceAll("[^a-zA-Z0-9]", "").replaceAll("\\s", "").toLowerCase();
        int i = 0;
        int j = newString.length()-1;
        while(j>i){
            if(!(newString.charAt(i)==newString.charAt(j))){
                    return false;
            }
            j--;
            i++;
        }
        return true;
    }
}
