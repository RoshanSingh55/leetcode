class Solution {

    public long[] resultArray(int[] nums, int k) {
        int n = nums.length;
        long[] result = new long[k];
        long[] dp = new long[k];
        for (int i = 0; i < n; i++) {
            long[] ndp = new long[k];
            ndp[nums[i] % k]++;
            for (int r = 0; r < k; r++) {
                ndp[(int) (((long) r * nums[i]) % k)] += dp[r];
            }
            dp = ndp; 
            for (int r = 0; r < k; r++) {
                result[r] += dp[r];
            }
        }
        return result;
    }
}