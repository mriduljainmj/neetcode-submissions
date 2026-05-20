class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int l =1;
        int r = 0;
        for (int pile : piles) {
            r = Math.max(r, pile);
        }
        int minSpeed  = r;

        while(l<=r){
            int m = l+(r-l)/2;
            if(canEat(piles,m,h)){
                minSpeed = m;
                r = m-1;
            }
            else{
                l  = m+1;
            }
        }
        return minSpeed;

    }

    public static boolean canEat(int[] piles, int m, int h){
        long hoursNeeded = 0;
        
        for (int pile : piles) {
            hoursNeeded += (pile + m - 1) / m;
        }
        
        return hoursNeeded <= h;
    }
}
