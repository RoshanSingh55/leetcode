class Solution {
    public int maximumProduct(int[] nums) {
        int n = nums.length;

        Arrays.sort(nums);

        int case1 = nums[n-1] * nums[n-2] * nums[n-3];
        int case2 = nums[0] * nums[1] * nums[n-1];
        
        return Math.max(case1, case2);
    }
}