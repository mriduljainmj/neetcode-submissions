class Solution {
    public boolean isPalindrome(String s) {
        int i = 0;
        char[] arr = s.replace(" ","").toLowerCase().replaceAll("[^a-z0-9]", "").toCharArray();
        int j = arr.length-1;
        while(j>i){
            if(arr[i]!=arr[j]){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}
