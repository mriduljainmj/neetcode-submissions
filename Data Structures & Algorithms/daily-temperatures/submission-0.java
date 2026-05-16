class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int[] ans = new int[temperatures.length];
        for(int i=0;i<temperatures.length;i++){
            int temp = 0;
            for(int j=i+1;j<temperatures.length;j++){
                temp++;
                if(temperatures[j]>temperatures[i]){
                    ans[i] = temp;
                    break;
                }
        
            }
        }

        return ans;
    }
}
