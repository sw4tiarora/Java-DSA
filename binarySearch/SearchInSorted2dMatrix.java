import java.util.*;

public class SearchInSorted2dMatrix {

    public boolean searchMatrix(int[][] matrix, int target) {
        int n = matrix.length;
        int m = matrix[0].length;

        int low = 0, high = n * m - 1;

        while (low <= high) {
            int mid = (low + high) / 2;

            int row = mid / m;
            int col = mid % m;

            if (matrix[row][col] == target)
                return true;
            else if (matrix[row][col] < target)
                low = mid + 1;
            else
                high = mid - 1;
        }

        return false;
    }

    public static void main(String[] args) {
        int[][] matrix = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12}
        };

        SearchInSorted2dMatrix obj = new SearchInSorted2dMatrix();

        System.out.println(obj.searchMatrix(matrix, 8));
    }
}

/* 2nd approach
public class SearchInSorted2dMatrix {

    public static boolean searchMatrix(int[][] mat, int target) {

        int n = mat.length;
        int m = mat[0].length;

        if (target < mat[0][0] || target > mat[n - 1][m - 1]) {
            return false;
        }

        int low = 0, high = n - 1;

        // Find the candidate row
        while (low <= high) {
            int midRow = low + (high - low) / 2;

            if (mat[midRow][0] < target) {
                low = midRow + 1;
            } else if (mat[midRow][0] == target) {
                return true;
            } else {
                high = midRow - 1;
            }
        }

        int row = high;

        // Binary search within the row
        int left = 0, right = m - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (mat[row][mid] < target) {
                left = mid + 1;
            } else if (mat[row][mid] > target) {
                right = mid - 1;
            } else {
                return true;
            }
        }

        return false;
    }

    public static void main(String[] args) {

        int[][] matrix = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12}
        };

        int target = 8;

        System.out.println("Target element present: " +
                searchMatrix(matrix, target));
    }
}
 */
