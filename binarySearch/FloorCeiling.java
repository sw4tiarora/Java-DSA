public class FloorCeiling {
    public static int floor(int[] arr, int x){
        int low = 0, high = arr.length - 1;
        int ans = -1;

        while(low <= high){
            int mid = low + (high - low) / 2;

            if(arr[mid] <= x){
                ans = arr[mid];
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return ans;
    }

    public static int ceiling(int[] arr, int x){
        int low = 0, high = arr.length - 1;
        int ans = -1;

        while(low <= high){
            int mid = low + (high - low) / 2;

            if(arr[mid] >= x){
                ans = arr[mid];
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 6, 8, 10};
        int x = 5;

        // Safe check
        if (arr == null || arr.length == 0) {
            System.out.println("Array is empty!");
            return;
        }

        int floorVal = floor(arr, x);
        int ceilVal = ceiling(arr, x);

        System.out.println("Floor: " + floorVal);
        System.out.println("Ceiling: " + ceilVal);
    }
}
