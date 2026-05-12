class Solution {

    public String encode(List<String> strs) {
        StringBuilder sb = new StringBuilder("");
        for(int i=0;i<strs.size();i++){
           
sb.append(Integer.toString(strs.get(i).length()))
  .append('#')
  .append(strs.get(i));

        }
        return sb.toString();
    }

    public List<String> decode(String str) {
        List<String> ans = new ArrayList<String>();
        int i = 0;
        while(i< str.length()){
           int j=i;
            while(str.charAt(j)!='#'){
                j = j+1;
            }
            int length = Integer.parseInt(str.substring(i, j));
            i = j+1;
            j = i+length;
            ans.add(str.substring(i,j));
            i = j;
        }
        return ans;
    }
}
