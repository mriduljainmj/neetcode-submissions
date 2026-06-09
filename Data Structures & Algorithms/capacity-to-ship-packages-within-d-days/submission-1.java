class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int l = 0;
        int r = 0;
        for(int weight : weights){
            l = Math.max(weight, l);
            r = r + weight;
        }
        int res = r;
        while(l<=r){
            int m = l + (r-l)/2;
            if(shipInDays(m, days, weights)){
                res = Math.min(res, m);
                r = m-1;
            }
            else{
                l = m+1;
            }
        }
        return res;

    }


    public static boolean shipInDays(int m, int days, int[] weights){
        int cap = m;
        int ship = 1;
        for(int w: weights){
            if(cap-w<0){
                ship++;
                cap = m;
            }
            cap = cap - w;
        }
        return ship<=days;
    }
}