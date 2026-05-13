class Solution {
    public int maxArea(int[] heights) {
        int l = 0;
        int r = heights.length-1;
        int ans = 0;
        while(r>l){
            int multiplier = Math.min(heights[l],heights[r]);
            int temp  = multiplier * (r-l);
            ans = Math.max(ans, temp);
            if(heights[l]<heights[r]){
                l++;
            }
            else if(heights[l]>heights[r]){
                r--;
            }
            else{
                l++;
            }
        }
        return ans;
    }
}
