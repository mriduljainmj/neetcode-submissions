class Solution {
    public int mySqrt(int x) {
        if(x<=1){
            return x;
        }
        int l =0;
        int r = x/2;
        int res = 0;
        while(l<=r){
            int m = l + (r-l)/2; 
            if((long)m*m > x){
                r = m-1;
            }
            else if((long)m*m < x){
                l = m+1;
                res = m;
            }
            else{
                return m;
            }
        }

        return res;
    }
}