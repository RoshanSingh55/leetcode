class Solution {
    public int differenceOfSum(int[] nums) {
        int e_sum = 0;
        int d_sum = 0;

        for (int i = 0; i < nums.length; i++) {
            e_sum += nums[i];

            int temp = nums[i];

            while (temp != 0) {
                d_sum += temp % 10;
                temp /= 10;
            }
        }

        return Math.abs(e_sum - d_sum);
    }
}