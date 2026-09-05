class Solution {
    public int firstStableIndex(int[] nums, int k) {
        int maxNow = -1;
        int cand = 0, max = 0;

        for (int i = 0; i < nums.length; i++) {
            maxNow = Math.max(maxNow, nums[i]);

            if (i == cand) max = maxNow;

            if (nums[i] < max - k)
                cand = i + 1;
        }

        return cand < nums.length ? cand : -1;
    }
}