class Solution {
    public int countDigitOccurrences(int[] nums, int digit) {
        int c = 0;
        for (int n:nums ) {
            while (n > 0) {
                if (n % 10 == digit) {
                    c++;
                }
                n /= 10;
            }
        }
        return c;
    }
}