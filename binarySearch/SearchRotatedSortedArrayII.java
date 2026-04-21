// duplicates

public class SearchRotatedSortedArrayII{
    public static boolean search(int[] arr, int k){
        int n = arr.length;
        int low = 0, high = n - 1;

        while(low <= high) {
            int mid = low + (high - low) / 2;

            if (arr[mid] == k) return true;

            if (arr[low] == arr[mid] && arr[mid] == arr[high]) {
                low++;
                high--;
                continue;
            }

            if (arr[low] <= arr[mid]) {
                if (arr[low] <= k && k <= arr[mid]) {
                    high = mid - 1;
                } else {
                    low = mid + 1;
                }
            }
            else{
                if(arr[mid] <= k && k <= arr[high]){
                    low = mid + 1;
                } else {
                    high = mid - 1;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] arr = {2, 5, 6, 0, 0, 1, 2};
        int target = 0;

        boolean found = search(arr, target);

        if (found) {
            System.out.println("Element found");
        } else {
            System.out.println("Element not found");
        }
    }
}
