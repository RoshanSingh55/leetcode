class Solution {
    public int waysToSplitArray(int[] nums) {
        int count = 0;
        long totalSum = 0, currSum = 0;
        for(int i=0; i<nums.length; i++){
            totalSum += nums[i];
        }
        for(int i=0; i<nums.length-1; i++){
            currSum += nums[i];
            if(currSum >= totalSum - currSum){
                 count++;
            }
        }
        return count;
    }
}