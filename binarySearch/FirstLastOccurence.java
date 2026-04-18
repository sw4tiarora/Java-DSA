public class FirstLastOccurence {
    static int lowerBound(int[] arr, int n, int x) {
        int low = 0, high = n - 1;
        int ans = n;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (arr[mid] >= x) {
                ans = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return ans;
    }

    static int upperBound(int[] arr, int n, int x) {
        int low = 0, high = n - 1;
        int ans = n;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (arr[mid] > x) {
                ans = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return ans;
    }

    static int[] firstAndLastPosition(int[] arr, int n, int k) {
        int lb = lowerBound(arr, n, k);

        if (lb == n || arr[lb] != k) {
            return new int[]{-1, -1};
        }

        int ub = upperBound(arr, n, k);

        return new int[]{lb, ub - 1};
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 4, 4, 5, 7, 9};
        int n = arr.length;
        int k = 4;

        int[] ans = firstAndLastPosition(arr, n, k);

        System.out.println("First: " + ans[0]);
        System.out.println("Last: " + ans[1]);
    }
}
