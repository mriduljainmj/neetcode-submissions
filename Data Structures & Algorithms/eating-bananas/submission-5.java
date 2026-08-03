class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int maxPile = -1;
        for(int pile:piles){
            maxPile = Math.max(maxPile, pile);
        }

        int l=1;
        int r = maxPile;
        int min = maxPile;
        while(r>=l){
            int m = l + (r-l)/2;
            if(eat(piles, m, h)){
                min = m;
                r = m-1;
            }
            else{
                l = m+1;
            }
        }
        return min;

    }


    public static boolean eat(int[] piles, int m , int h){
        int hoursNeeded = 0;
        for(int pile:piles){
             hoursNeeded += (pile + m -1 )/m;
        }

        return hoursNeeded<=h;
    }   
}
