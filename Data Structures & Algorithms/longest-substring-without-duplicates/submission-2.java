class Solution {
    public int lengthOfLongestSubstring(String s) {
        int L = 0;
        int total = 0;
        HashSet<Character> set = new HashSet<Character>();
        char[] arr = s.toCharArray();
        for(int R=0;R<arr.length;R++){
            while(set.contains(arr[R])){
                set.remove(arr[L]);
                L++;
            } 
            set.add(arr[R]);
            total = Math.max(total, R-L+1);
        }
        return total;
    }
}
