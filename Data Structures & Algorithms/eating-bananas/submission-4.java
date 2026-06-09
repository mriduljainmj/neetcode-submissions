class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int l = 1;
        int r = 0;
        for(int pile: piles){
            r = Math.max(pile,r);
        }
        int minHours = r;

        while(r>=l){
            int m = l + (r-l)/2;
            if(canEat(piles, m , h)){
                minHours = m;
                r = m-1;
            }
            else{
                l = m+1;
            }
        }

        return minHours;

    }

    public static boolean canEat(int[] piles, int m, int h){
        int hoursNeeded = 0;
        for(int pile : piles){
            hoursNeeded += (pile + m -1 )/m;
        }
        return hoursNeeded <= h;
    }
}
