//unique elements

import java.util.*;

public class MinimumRotatedSortedArray {
    public static int findMin(int[] arr){
        int low = 0, high = arr.length - 1;
        int ans = Integer.MAX_VALUE;

        while(low <= high){
            int mid = low + (high - low) / 2;

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
        int[] arr = {4, 5, 6, 7, 0, 1, 2};
        System.out.println("Minimum element: " + findMin(arr));

    }
}

