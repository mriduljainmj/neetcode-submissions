class Solution {
    public boolean validPalindrome(String s) {
        int l = 0;
        int r = s.length() - 1;

        if (isValid(s, l, r)) {
            return true;
        }

        while (l <= r) {
            if (!(s.charAt(l) == s.charAt(r))) {
                return isValid(s, l + 1, r) || isValid(s, l, r - 1);
            }
            l++;
            r--;
        }
        return true;
    }

    public static boolean isValid(String s, int l, int r) {
        while (l <= r) {
            if (!(s.charAt(l) == s.charAt(r))) {
                return false;
            }
            l++;
            r--;
        }
        return true;
    }
}