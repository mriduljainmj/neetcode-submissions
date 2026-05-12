class Solution {
    public int numRescueBoats(int[] people, int limit) {
        int ans = 0;
        Arrays.sort(people);
        int l =0;
        int r = people.length-1;
        while(r>l){
            if(!(people[l]+people[r]>limit)){
                l++;
            }
            ans++;
            r--;

        }
        if(l==r){
            ans++;
        }
        return ans;
    }
}