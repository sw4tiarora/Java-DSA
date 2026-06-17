public class RowsWithMaxNoOf1s {

    public static int binarySearch(int[][] mat, int n, int m){
        int maxOnes = 0, row = -1;
        for(int i = 0; i < n; i++) {
            int low = 0;
            int high = m - 1;
            int noOfOnes = 0;
            int index = -1;
            while (low <= high) {
                int mid = (low + high) / 2;

                if (mat[i][mid] == 1) {
                    index = mid;
                    high = mid - 1;

                } else {
                    low = mid + 1;
                }

            }
            if(index == -1){
                noOfOnes = 0;
            } else{
                noOfOnes = m - index;
            }
            if(noOfOnes > maxOnes){
                maxOnes = noOfOnes;
                row = i;
            }
        }
        return row;
    }

    public static void main(String[] args){
        int[][] matrix = {{1, 1, 1}, {0, 0, 1}, {0, 0, 0}};
        int n = 3, m = 3;
        System.out.println("The row with maximum number of 1s is: " + binarySearch(matrix, n, m));
    }
}
