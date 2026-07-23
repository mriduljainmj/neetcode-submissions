class Solution {
    public int maxArea(int[] heights) {
        int l= 0;
        int r = heights.length-1;
        int ans = 0;
        for(int i=0;i<heights.length;i++){
            int minHeight = Math.min(heights[l],heights[r]);
            int totalCapacity = minHeight * (r-l);
            ans = Math.max(ans,totalCapacity);
            if(heights[l]>heights[r]){
                r--;
            }
            else if(heights[r]>heights[l]){
                l++;
            }
            else{
                l++;
            }
        }
        return ans;
    }
}
