// minimum no. of days to make m bouquets

public class RoseGarden {
    public static boolean possible(int[] arr, int day, int m, int k){
        int cnt = 0;
        int noOfB = 0;

        for (int i = 0; i < arr.length; i++) {
            if(arr[i] <= day){
                cnt++;
            } else {
                noOfB += cnt/k;
                cnt = 0;
            }
        }
        noOfB += cnt/k;
        return noOfB >= m;
    }
    public static int roseGarden(int[] arr, int r, int b){
        long val = 1L * r * b;
        if(val > arr.length) return -1;

        int mini = Integer.MAX_VALUE;
        int maxi = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            mini = Math.min(mini, arr[i]);
            maxi = Math.max(maxi, arr[i]);
        }

        int low = mini, high = maxi;

        while(low <= high){
            int mid = low + (high - low) / 2;

            if(possible(arr, mid, r, b)){
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return low;
    }

    public static void main(String[] args) {
        int[] arr = {7, 7, 7, 7, 13, 11, 12, 7};

        int r = 2; // bouquets
        int b = 3; // adjacency

        System.out.println(roseGarden(arr, r, b));
    }
}