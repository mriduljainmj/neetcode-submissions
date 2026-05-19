class Solution {
    public int maxProfit(int[] prices) {
        int L=0;
        int R = 1;
        int maxProfit = 0;
        while(R<prices.length){
            if(prices[R]>prices[L]){
                int max = prices[R] - prices[L];
                maxProfit = Math.max(max, maxProfit);
            }
            else{
                L = R;
            }
            R++;
        }
        return maxProfit;
    }
}
