class Solution {
    public int maxProfit(int[] prices) {
        int L=0;
        int R =0;
        int ans=0;
        while(R<prices.length){
            if(prices[R]>prices[L]){
                int pro = prices[R] - prices[L];
                ans = Math.max(pro,ans);
            }
            else{
                L=R;
            }
            R++;
        }
        return ans;
    }
}
