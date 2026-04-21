public class CountOccurences {
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

    static int countOccurence(int[] arr, int n, int x){
        int lb = lowerBound(arr, n, x);
        if(lb == n && lb != x) return 0;

        int ub = upperBound(arr, n, x);

        return ub - lb;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 2, 3, 4, 5};
        int n = arr.length;
        int x = 2;

        int count = countOccurence(arr, n, x);

        System.out.println("Number of occurrences of " + x + " = " + count);
    }
}
