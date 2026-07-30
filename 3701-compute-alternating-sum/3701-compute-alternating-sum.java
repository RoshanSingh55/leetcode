class Solution {
    public int alternatingSum(int[] nums) {
        int odd=0;
        int even=0;
        for(int i = 0; i<nums.length; i++){
            if(i % 2 == 0 ){
                even += nums[i];
            }
            else{
                odd += nums[i];
            }
        }
        return even - odd;
    }
}