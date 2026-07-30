class Solution {
    public boolean canAliceWin(int[] nums) {
        int c1 = 0;
        int c2 = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < 10) {
                c1 += nums[i];
            } else {
                c2 += nums[i];
            }
        }
        return c1 != c2;
    }
}