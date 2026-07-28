class Solution {
    public int maxSubArray(int[] nums) {
    int cs = 0;
    int ms = Integer.MIN_VALUE;
    for (int i=0; i<nums.length; i++){

    cs = cs + nums[i];
    if (cs > ms) {
                ms = cs;
            }
    if(cs<0) {
        cs = 0;
    }
    }
    return ms;
    

    }
}