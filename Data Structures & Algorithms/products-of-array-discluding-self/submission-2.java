class Solution {
    public int[] productExceptSelf(int[] nums) {
        int totalMultiply = nums[0];
        int[] output = new int[nums.length];
        boolean checkZero = false;
        boolean checkZeroMultiple = false;
        int zeroCount = 0;
        for(int i=1;i<nums.length;i++){
            if(nums[i] != 0){
                totalMultiply = totalMultiply * nums[i]; 
            }
            else{
                  zeroCount++;
                  checkZero = true;
            }
           
        }

        if(zeroCount>1){
           checkZeroMultiple = true; 
        }

        for(int i=0;i<nums.length;i++){
            if(checkZeroMultiple){
                output[i] = 0;
            }
            else if (nums[i]==0){
                  output[i] = totalMultiply;
            }
            else{
                if(checkZero){
                    output[i] = 0;
                }
                else{
                    output[i] = totalMultiply/nums[i];
                }
        
            }
            
        }
       
        return output;

    }
}  
