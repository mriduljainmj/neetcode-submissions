class Solution {
    public int lengthOfLongestSubstring(String s) {
        int l =0;
        int maxSub = 0;
         if(s.length()==1){
            return 1;
        }
        HashSet<Character> set = new HashSet<>();
        for(int r=0;r<s.length();r++){
            while(set.contains(s.charAt(r))){
                set.remove(s.charAt(l));
                l++;
            }
            set.add(s.charAt(r));
            maxSub = Math.max(maxSub, r-l+1);
        }
        return maxSub;
    }
}
