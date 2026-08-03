class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int l = 0;
        int r = 0;
        for(int weight : weights){
            l = Math.max(l,weight);
            r = r + weight;
        }
        int minShip = r;

        while(r>=l){
            int m = l + (r-l)/2;
            if(canShip(weights, m, days)){
                minShip  = Math.min(minShip,m);
                r = m-1;
            }
            else{
                l = m + 1;
            }
        }

        return minShip;

    }


    public static boolean canShip(int[] weights, int m, int days){
        int cap = m;
        int ship = 1;
        for(int w : weights){
            if(cap-w<0){
                ship++;
                cap = m;
            }
            cap = cap-w;
        }
        return ship<=days;
    }
}