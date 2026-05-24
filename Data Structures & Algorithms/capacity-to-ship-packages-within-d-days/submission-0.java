class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int l = 0;
        int r = 0;
        for(int w: weights){
            l = Math.max(l, w);
            r = r + w;
        }
        int capacity = r;
        while(l<=r){
            int m = l + (r-l)/2;
            if(canShip(m,weights,days)){
                capacity = Math.min(capacity, m); 
                r = m-1;
            }
            else{
                l = m+1;
            }
        }
        return capacity;

    }

    public static boolean canShip(int cap, int[] weights, int days){
        int ship = 1;
        int currCap = cap;
        for(int w : weights){
            if(currCap - w < 0){
                ship++;
                currCap = cap;
            }
            currCap = currCap - w;
        }
        return ship<=days;
    }
}