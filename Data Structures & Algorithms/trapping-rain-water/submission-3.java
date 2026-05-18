class Solution {
    public int trap(int[] height) {
        int l = 0;
        int r = height.length-1;
        int maxL = height[0];
        int maxR = height[height.length-1];
        int res = 0;
        while(l<r){
            if(height[l]<=height[r]){
                l++;
                int ans = maxL - height[l];
                if(ans>0){
                    res = res + ans;
                }
                maxL = Math.max(maxL, height[l]);
            }
            else{
                r--;
                int ans = maxR - height[r];
                if(ans>0){
                    res = res + ans;
                }
                maxR = Math.max(maxR, height[r]);
            }
        }
        return res;
    }
}
