// duplicates
import java.util.*;

public class MinimumSortedRotatedArray {
    public static int findMin(int[] arr){
        int low = 0, high = arr.length - 1;
        int ans = Integer.MAX_VALUE;

        while(low <= high){
            int mid = low + (high - low) / 2;

            if(arr[low] == arr[mid] && arr[mid] == arr[high]){
                low++;
                high--;
                ans = Math.min(ans, arr[low]);
                continue;
            }

            if(arr[low] <= arr[high]){
                ans = Math.min(ans, arr[low]);
                break;
            }

            if(arr[low] <= arr[mid]){
                ans = Math.min(ans, arr[low]);
                low = mid + 1;
            } else {
                high = mid - 1;
                ans = Math.min(ans, arr[mid]);
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[][] testCases = {
                {4, 5, 6, 7, 0, 1, 2},     // normal rotated
                {2, 2, 2, 0, 1},           // duplicates + rotation
                {1, 2, 3, 4, 5},           // already sorted
                {3, 3, 3, 3, 3},           // all duplicates
                {10, 1, 10, 10, 10}        // tricky duplicate case
        };

        for (int i = 0; i < testCases.length; i++) {
            System.out.println("Minimum element: " + findMin(testCases[i]));
        }
    }
}
