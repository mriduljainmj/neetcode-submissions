class Solution {
    public int characterReplacement(String s, int k) {
        int res = 0;
        HashMap<Character,Integer> set = new HashMap<>();
        int maxF = 0;
        int L =0;
        for(int R =0; R<s.length();R++){
            set.put(s.charAt(R), set.getOrDefault(s.charAt(R),0)+1);
            maxF = Math.max(maxF, set.get(s.charAt(R)));
            while(R-L+1 - maxF > k){
                set.put(s.charAt(L), set.get(s.charAt(L))-1);
                L++;
            }
            res = Math.max(res, R-L+1);
        }
        return res;
    }
}
