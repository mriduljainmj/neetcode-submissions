class Solution {
    public int trap(int[] height) {
        int l =0;
        int r = height.length-1;
        int maxL = height[0];
        int maxR = height[height.length-1];
        int ans = 0;
        while(l<r){
            if(height[l]<=height[r]){
                l++;
                int res = maxL - height[l];
                if(res>0) ans = ans + res;
                maxL = Math.max(maxL, height[l]);
            }
            else{
                r--;
                int res = maxR - height[r];
                if(res>0) ans = ans + res;
                maxR = Math.max(maxR, height[r]);
            }
        }
        return ans;
    }
}
