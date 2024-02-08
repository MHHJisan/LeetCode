class Solution {
    public int arraySign(int[] nums) {
        int temp =1;
        for(int i=0; i<nums.length;i++){
            if(nums[i] == 0){
                return 0;
            }else{
                temp *= nums[i];
                if(temp > 0){
                    temp = 1;
                }else{
                    temp = -1;
                }
            }
        }
        if(temp > 0){
            return 1;
        }else{
            return -1;
        }
    }
}