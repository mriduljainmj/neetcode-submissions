class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> hashMap = new HashMap<String, List<String>>();
        for(int i=0;i<strs.length;i++){
            char[] s = strs[i].toCharArray();
            Arrays.sort(s);
            String sortedString = new String(s);
            hashMap.computeIfAbsent(sortedString, k -> new ArrayList<>()).add(strs[i]);
        }
        return new ArrayList<>(hashMap.values());
    }
}
