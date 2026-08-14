public class WordSearch {
    private boolean helper(char[][] board, String word, int row, int col, int ind){
        // base case
        if(ind == word.length()) return true;
        if(row < 0 || row >= board.length || col < 0 || col >= board[0].length) return false;

        if(board[row][col] != word.charAt(ind)) return false;

        char temp = board[row][col];
        board[row][col] = '#';


        boolean found =
                helper(board, word, row - 1, col, ind + 1) || // up
                        helper(board, word, row + 1, col, ind + 1) || // down
                        helper(board, word, row, col - 1, ind + 1) || // left
                        helper(board, word, row, col + 1, ind + 1);    // right


        // restore
        board[row][col] = temp;

        return found;
    }

    public boolean existsWord(char[][] board, String word){
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                if(board[i][j] == word.charAt(0)){
                    if(helper(board, word, i, j, 0)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        char[][] board = {
                {'A', 'B', 'C', 'E'},
                {'S', 'F', 'C', 'S'},
                {'A', 'D', 'E', 'E'}
        };
        String word = "ABCCED";
        WordSearch obj = new WordSearch();
        boolean result = obj.existsWord(board, word);
        System.out.println(result);
    }
}
