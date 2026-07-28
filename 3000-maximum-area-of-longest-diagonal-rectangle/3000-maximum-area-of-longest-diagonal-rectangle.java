import java.util.Comparator;
import java.util.Arrays;

class Solution {
    public int areaOfMaxDiagonal(int[][] dimensions) {
        
        long maxDiagonalSquared = 0;
        int maxArea = 0;

        for (int[] dim : dimensions) {
            int length = dim[0];
            int width = dim[1];

            long currentDiagonalSquared = (long) length * length + (long) width * width;
            int currentArea = length * width;

            if (currentDiagonalSquared > maxDiagonalSquared) {
           
                maxDiagonalSquared = currentDiagonalSquared;
                maxArea = currentArea;
            } else if (currentDiagonalSquared == maxDiagonalSquared) {

                if (currentArea > maxArea) {
                    maxArea = currentArea;
                }
            }
        }
        return maxArea;
    }
}