// Definition for a pair
// class Pair {
//     int key;
//     String value;
//
//     Pair(int key, String value) {
//         this.key = key;
//         this.value = value;
//     }
// }
public class Solution {
    public List<List<Pair>> insertionSort(List<Pair> pairs) {
        if(pairs.size()==0){
            return new ArrayList<>();
        }
        List<List<Pair>> ansList = new ArrayList<List<Pair>>();
        List<Pair> pairn = new ArrayList<Pair>();
            for (Pair p : pairs) {
            pairn.add(new Pair(p.key, p.value));
        }
        ansList.add(pairn);
        for(int i=1;i<pairs.size();i++){
            int j = i-1;
            while(j>=0 && pairs.get(j+1).key<pairs.get(j).key){
                Pair tempPair = new Pair(pairs.get(j).key,pairs.get(j).value);
                pairs.set(j,pairs.get(j+1));
                pairs.set(j+1,tempPair);
                j--;
            }
            List<Pair> pair = new ArrayList<Pair>();
            for (Pair p : pairs) {
            pair.add(new Pair(p.key, p.value));
            }
         ansList.add(pair);
        }
        
        return ansList;
    }
}
