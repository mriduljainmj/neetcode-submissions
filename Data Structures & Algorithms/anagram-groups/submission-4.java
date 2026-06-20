class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> map = new HashMap<>();
        for(String s : strs){
            char[] chArray = s.toCharArray();
            Arrays.sort(chArray);
            String newS = new String(chArray);
            map.putIfAbsent(newS, new ArrayList<>());
            map.get(newS).add(s);
        }

         return new ArrayList<>(map.values());
    }
}
