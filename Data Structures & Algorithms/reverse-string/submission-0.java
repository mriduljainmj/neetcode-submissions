class Solution {
    public void reverseString(char[] s) {
        int i = 0 , j = s.length-1;
        while(j>i){
            char temp = s[j];
            s[j] = s[i];
            s[i] = temp;
            j--;
            i++;
        }

    }
}