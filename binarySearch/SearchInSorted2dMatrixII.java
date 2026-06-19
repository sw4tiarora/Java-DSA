public class SearchInSorted2dMatrixII {
    public static boolean searchMatrix(int[][] mat, int target){
        int n = mat.length;
        int m = mat[0].length;

        int row = 0, col = m - 1;
        while(row < n && col >= 0){
            if(mat[row][col] == target){
                return true;
            } else if(mat[row][col] > target){
                col--;
            } else {
                row++;
            }
        }
        return false;
    }
    public static void main(String[] args) {

        int[][] matrix = {
                {1, 4, 7, 11},
                {2, 5, 8, 12},
                {3, 6, 9, 16},
                {10, 13, 14, 17}
        };

        int target = 6;

        System.out.println("Target element present: " +
                searchMatrix(matrix, target));
    }
}