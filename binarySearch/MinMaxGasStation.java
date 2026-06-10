public class MinMaxGasStation {

    static int stationsNeeded(int[] arr, double dist) {
        int stations = 0;
        double segments = 0.0;
        for (int i = 0; i < arr.length - 1; i++) {
            int gap = arr[i+1] - arr[i];
            segments = Math.ceil(gap / dist);
            stations += (int)(segments - 1);
        }
        return stations;
    }

    static double minimiseMaxDistance(int[] arr, int k) {
        double maxGap = 0;
        for(int i = 1; i < arr.length; i++){
            int gap = arr[i] - arr[i-1];
            maxGap = Math.max(maxGap, gap);
        }
        double low = 0;
        double high = maxGap;

        while(high - low > 1e-6){
            double mid = (low + high) / 2.0;

            if(stationsNeeded(arr, mid) <= k){
                high = mid;
            } else {
                low = mid;
            }
        }
        return high;
    }

    public static void main(String[] args) {

        int[] arr = {1, 13, 17, 23};
        int k = 5;

        double ans = minimiseMaxDistance(arr, k);

        System.out.println(ans);
    }
}