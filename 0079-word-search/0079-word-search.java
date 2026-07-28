class Solution {

    int[][] directions = new int [] [] {{-1, 0}, {0, 1}, {1, 0}, {0, -1}};

    public boolean isValid(int x, int y, int rows, int cols){
        return (x >= 0 && x < rows && y >= 0 && y < cols);
        
    }

    private boolean search (int i, int j, char[][] board, int index, String word, boolean [][] visited){
        if(word.charAt(index) != board[i][j]){
            return false;
        }

        if(index == word.length() - 1){
            return true;
        }

        visited[i][j] = true;
        boolean foundWord = false;
        for (int[] direction : directions) {
            int x = i + direction[0];
            int y = j + direction[1];
            if(isValid(x, y, board.length, board[0].length) && visited[x][y] == false) {
                foundWord = foundWord || search(x, y, board, index + 1, word, visited);
            }
        }

        visited[i][j] = false;
        return foundWord;
    } 

    public boolean exist(char[][] board, String word) {
        int rows = board.length;
        int cols = board[0].length;

        boolean[][] visited = new boolean[rows][cols];

        for(int i = 0; i < rows; i++){
            for(int j = 0; j < cols; j++){
                char curr = board[i][j];
                if(curr == word.charAt(0)) {
                    if(search(i, j, board, 0, word, visited)) return true;
                }
            }
        }
        return false;
    }
}