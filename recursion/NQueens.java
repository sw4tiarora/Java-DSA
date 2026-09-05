import java.util.*;

public class NQueens {
    public void solve(int col, char[][] board, int n, int[] leftRow, int[] upperDiagonal, int[] lowerDiagonal, List<List<String>> res){
        if(col == n){
            List<String> temp = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                temp.add(new String(board[i]));
            }
            res.add(temp);
            return;
        }

        // iterate through rows

        for (int row = 0; row < n; row++) {
            // check safety
            if(leftRow[row] == 0 && lowerDiagonal[row + col] == 0 && upperDiagonal[n - 1 + col - row] == 0){
                board[row][col] = 'Q';
                leftRow[row] = 1;
                lowerDiagonal[row + col] = 1;
                upperDiagonal[n - 1 + col - row] = 1;

                //recurse
                solve(col + 1, board, n, leftRow, upperDiagonal, lowerDiagonal, res);

                //backtrack
                board[row][col] = '.';
                leftRow[row] = 0;
                lowerDiagonal[row + col] = 0;
                upperDiagonal[n - 1 + col - row] = 0;

            }
        }
    }

    public List<List<String>> solveNQueens(int n){
        List<List<String>> res = new ArrayList<>();
        char[][] board = new char[n][n];
        for(char[] row : board) Arrays.fill(row, '.');
        int[] leftRow = new int[n];
        int[] lowerDiagonal = new int[2 * n - 1];
        int[] upperDiagonal = new int[2 * n - 1];
        solve(0, board, n, leftRow, upperDiagonal, lowerDiagonal, res);
        return res;
    }

    public static void main(String[] args) {
        NQueens obj = new NQueens();

        List<List<String>> ans = obj.solveNQueens(4);

        for (List<String> solution : ans) {
            for (String row : solution) {
                System.out.println(row);
            }
            System.out.println();
        }
    }
}
