class Solution {
    public boolean isPalindrome(String s) {
        s = s.replaceAll("[^a-zA-Z0-9]", "").replaceAll("\\s", "").toLowerCase();
        int i =0;
        int j=s.length()-1;
        while(j>i){
            if(s.charAt(i)==s.charAt(j)){
                i++;
                j--;
                continue;
            }
            else{
                return false;
            }
        }

        return true;

    }
}
