//split array - largest sum

import java.util.*;

public class PaintersPartition {

    static int countPartitions(int[] arr, int maxSum) {
        int partitions = 1;
        long currentSum = 0;

        for (int num : arr) {
            if (currentSum + num <= maxSum) {
                currentSum += num;
            } else {
                partitions++;
                currentSum = num;
            }
        }

        return partitions;
    }

    static int findPages(int[] arr, int n, int k) {
        int low = Arrays.stream(arr).max().getAsInt();
        int high = Arrays.stream(arr).sum();

        while (low <= high) {
            int mid = low + (high - low) / 2;

            int partitions = countPartitions(arr, mid);

            if (partitions > k) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return low;
    }

    static int largestSubarraySumMinimized(int[] arr, int k) {
        return findPages(arr, arr.length, k);
    }

    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40};
        int k = 2;

        System.out.println(largestSubarraySumMinimized(arr, k));
    }
}