class Solution {
    public int maxArea(int[] heights) {
        int l =0;
        int r = heights.length-1;
        int ans = 0;
        while(r>l){
            int multiplier = Math.min(heights[r],heights[l]);
            int res = multiplier * (r-l);
            ans = Math.max(ans, res);
            if(heights[l]>heights[r]){
                r--;
            }
            else if(heights[l]<heights[r]){
                l++;
            }
            else{
                l++;
            }
        }
        return ans;
    }
}
