// Definition for a pair.
// class Pair {
//     public int key;
//     public String value;
//
//     public Pair(int key, String value) {
//         this.key = key;
//         this.value = value;
//     }
// }
class Solution {
    public List<Pair> mergeSort(List<Pair> pairs) {
        return mergeSortt(pairs,0,pairs.size()-1);
    
    }
 public static List<Pair> mergeSortt(List<Pair> arr, int l, int r) { 
    if (l < r) {
        // Find the middle point of arr
        int m = (l + r) / 2;

        mergeSortt(arr, l, m);   // sort left half
        mergeSortt(arr, m+1, r); // sort right half
        merge(arr, l, m, r);    // merge sorted halfs
    }
    return arr;
}

public static void merge(List<Pair> arr, int l, int m, int r){
    int l1 = m-l+1;
    int l2 = r-m;

    List<Pair> L = new ArrayList<Pair>();
    List<Pair> R = new ArrayList<Pair>();

    for(int i=0;i<l1;i++){
        L.add(arr.get(i+l)); 
    }

    for(int j=0;j<l2;j++){
        R.add(arr.get(j+m+1));
    }

    int i=0;
    int j =0;
    int k =l;

    while(i<l1 && l2>j){
        if(R.get(j).key>=L.get(i).key){
            arr.set(k,L.get(i));
            i++;
        }
        else{
            arr.set(k,R.get(j));
            j++;
        }
        k++;
    }
    while (i < l1) {
        arr.set(k,L.get(i));
        i++;
        k++;
    }

    // Copy remaining elements of R[] if any 
    while (j < l2) {
        arr.set(k,R.get(j));
        j++;
        k++;
    }

}

}
