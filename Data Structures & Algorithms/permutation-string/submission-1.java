class Solution {
    public boolean checkInclusion(String s1, String s2) {
        HashMap<Character, Integer> map = new HashMap<>();
        for(int i=0;i<s1.length();i++){
            map.put(s1.charAt(i),map.getOrDefault(s1.charAt(i),0)+1);
        }
        int needed = map.size();
        for(int i =0;i<s2.length();i++){
            HashMap<Character, Integer> map2 = new HashMap<>();
            int count = 0;
            for(int j=i;j<s2.length();j++){
                map2.put(s2.charAt(j),map2.getOrDefault(s2.charAt(j),0)+1);
                if(map.getOrDefault(s2.charAt(j),0) < map2.get(s2.charAt(j))){
                    break;
                }
                if(map.getOrDefault(s2.charAt(j),0) == map2.get(s2.charAt(j))){
                    count++;
                }
                if(count == needed){
                    return true;
                }
            }
        }
        return false;

    }
}
