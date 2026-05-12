class Solution {
    public int lengthOfLongestSubstring(String s) {
        int L = 0;
        int ans = 0;
        if(s.length()==1){
            return 1;
        }
        HashSet<Character> map = new HashSet<>();
        for(int R=0;R<s.length();R++){
           while(map.contains(s.charAt(R))){
                map.remove(s.charAt(L));
                L++;
           }
           map.add(s.charAt(R));
           ans = Math.max(ans, R-L+1);
        }
        return ans;
    }
}
