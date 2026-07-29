class Solution {
    public String minWindow(String s, String t) {
        if (t.isEmpty())
            return "";
        HashMap<Character, Integer> mapT = new HashMap<>();
        for (int i = 0; i < t.length(); i++) {
            mapT.put(t.charAt(i), mapT.getOrDefault(t.charAt(i), 0) + 1);
        }
        HashMap<Character, Integer> window = new HashMap<>();
        int needed = mapT.size();
        int have = 0;
        int[] res = { -1, -1 };
        int resLength = Integer.MAX_VALUE;
        int L = 0;

        for (int R = 0; R < s.length(); R++) {
            char c = s.charAt(R);
            window.put(c, window.getOrDefault(c, 0) + 1);
            if (mapT.containsKey(c) && window.get(c).equals(mapT.get(c))) {
                have++;
            }

            while (have == needed) {
                if (R - L + 1 < resLength) {
                    resLength = R - L + 1;
                    res[0] = L;
                    res[1] = R;
                }

                char lChar = s.charAt(L);
                window.put(lChar, window.get(lChar) - 1);
                if (mapT.containsKey(lChar) && window.get(lChar) < mapT.get(lChar)) {
                    have--;
                }
                L++;
            }
        }

        return resLength == Integer.MAX_VALUE ? "" : s.substring(res[0], res[1] + 1);
    }
}
