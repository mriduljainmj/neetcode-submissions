class Solution {
    public int findJudge(int n, int[][] trust) {
       int[] incoming = new int[n+1];
       int[] outgoing = new int[n+1];

        for(int[] t : trust){
            outgoing[t[0]] = outgoing[t[0]] + 1;
            incoming[t[1]] = incoming[t[1]] + 1;
        }

        for(int i = 1; i<=n ; i++ ){
            if(incoming[i] == n-1 && outgoing[i] == 0){
                return i;
            }
        }
        return -1;
       
    }
}