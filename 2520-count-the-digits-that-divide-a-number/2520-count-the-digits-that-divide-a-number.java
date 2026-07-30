class Solution {
    public int countDigits(int num) {
        int temp = 0;
        int count = 0;
        int v = num;
        while (v > 0) {
            temp = v % 10;
            v = v / 10;

            if (num % temp == 0) {
                count++;
            }
        }
        return count;
    }
}