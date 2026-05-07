// smallest divisor given a threshold

public class SmallestDivisor {
    public static boolean isPossible(int[] arr, int d, int t){
        long sum = 0;
        for(int i = 0; i < arr.length; i++){
            sum += (int)Math.ceil((double)arr[i]/d);
        }
        return sum <= t;
    }

    public static int smallestDivisor(int[] arr, int t){
        if(arr.length > t) return -1;
        long sum = 0;
        int maxi = Integer.MIN_VALUE;
        for(int num : arr){
            sum += num;
            maxi = Math.max(maxi, num);
        }
        int low = (int)Math.ceil((double)sum/t);
        int high = maxi;

        while(low <= high){
            int mid = low + (high - low) / 2;

            if(isPossible(arr, mid, t)){
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return low;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 5, 9};
        int threshold = 6;
        System.out.println("Smallest Divisor: " + (smallestDivisor(arr, threshold)));
    }
}
