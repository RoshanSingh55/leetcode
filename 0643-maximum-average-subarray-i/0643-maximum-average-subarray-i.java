class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int currSum = 0;
        for(int i=0; i<k; i++){
            currSum += nums[i];
        }
        int maxSum = currSum;
        for(int i=1; i<=nums.length - k; i++){
            currSum = currSum - nums[i-1] + nums[i+k-1];
            if(currSum > maxSum){
                maxSum = currSum;
            }
        }
        return (double)maxSum / k;  
    }
}