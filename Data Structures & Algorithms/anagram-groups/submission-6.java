class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> map = new HashMap<>();
        for(String s: strs){
            char[] charArr = s.toCharArray();
            Arrays.sort(charArr);
            String newS = new String(charArr);
            map.putIfAbsent(newS, new ArrayList<>());
            map.get(newS).add(s);
        }

        return new ArrayList<>(map.values());
    }
}
