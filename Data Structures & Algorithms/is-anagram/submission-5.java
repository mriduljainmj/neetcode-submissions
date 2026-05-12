class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap<Character, Integer> hashs = new HashMap<>();
        HashMap<Character, Integer> hasht = new HashMap<>();

        if(s.length()!=t.length()){
            return false;
        }

        for(int i = 0; i<s.length();i++){
            if(hashs.containsKey(s.charAt(i))){
                 hashs.put(s.charAt(i),hashs.get(s.charAt(i)+1));
            }
            else{
hashs.put(s.charAt(i),1);
            }
            
        }

        for(int j = 0; j<t.length();j++){
            if(hasht.containsKey(t.charAt(j))){
                 hasht.put(t.charAt(j),hasht.get(t.charAt(j)+1));
            }
            else{
  hasht.put(t.charAt(j),1);
            }
          
        }

        if(hashs.equals(hasht)){
            return true;
        }

        return false;

    }
}
