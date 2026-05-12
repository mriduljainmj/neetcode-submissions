class Solution {
    public int characterReplacement(String s, int k) {
        HashMap<Character,Integer> map = new HashMap<>();
        int res = 0;

        int L = 0;
        int  maxf = 0;
        for(int R =0;R<s.length();R++){
            map.put(s.charAt(R),map.getOrDefault(s.charAt(R),0)+1);
            maxf = Math.max(maxf, map.get(s.charAt(R)));
            while((R-L+1) - maxf > k){
                map.put(s.charAt(L), map.get(s.charAt(L))-1);
                L++;
            }
            res = Math.max(res, R-L+1);
        }
        return res;
    }
}
