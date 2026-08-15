class Solution {
    public int longestSubsequence(int[] nums) {
        int tot = 0;
        boolean nonZero = false;

        for (int x : nums) {
            nonZero |= x > 0;
            tot ^= x;
        }

        if (!nonZero) return 0;
        return tot == 0 ? nums.length - 1 : nums.length;
    }
}