class Solution {
    public int[] findDiagonalOrder(int[][] matrix) {
        // matrix dimensions
        int m = matrix.length;
        int n = matrix[0].length;

        // result array
        int[] result = new int[m * n];

        // index for the result array
        int index = 0;

        // temporary list to store diagonal elements
        List<Integer> diagonal = new ArrayList<>();

        // loop through each diagonal starting from the top-left corner moving towards the right-bottom corner
        for (int diag = 0; diag < m + n - 1; ++diag) {
            // determine the starting row index for the current diagonal
            int row = diag < n ? 0 : diag - n + 1;
          
            // determine the starting column index for the current diagonal
            int col = diag < n ? diag : n - 1;

            // collect all the elements from the current diagonal
            while (row < m && col >= 0) {
                diagonal.add(matrix[row][col]);
                ++row;
                --col;
            }

            // reverse the diagonal elements if we are in an even diagonal (starting counting from 0)
            if (diag % 2 == 0) {
                Collections.reverse(diagonal);
            }

            // add the diagonal elements to the result array
            for (int element : diagonal) {
                result[index++] = element;
            }

            // clear the temporary diagonal list for the next iteration
            diagonal.clear();
        }
        return result;
    }
}
