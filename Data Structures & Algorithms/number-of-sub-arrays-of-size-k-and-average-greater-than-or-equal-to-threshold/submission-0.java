class Solution {
    public int numOfSubarrays(int[] arr, int k, int threshold) {
        int L=0;
        int total = 0;
        int currTotal = 0;
        HashMap<Integer,Integer> window = new HashMap<Integer,Integer>();
        for(int R=0;R<=arr.length;R++){
            if(R-L+1>k){
                if(currTotal/k>=threshold){
                    total++;
                }
                window.put(arr[L],window.get(arr[L])-1);
                  currTotal = currTotal - arr[L];
                L++;
              
            if(R==arr.length){
                break;
            }
            }
        
            if(window.containsKey(arr[R])){
                 window.put(arr[R],window.get(arr[R])+1);
            }
            else{
                window.put(arr[R],1);
            }
            currTotal += arr[R];
           
        }
        return total;
    }
}