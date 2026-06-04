import java.util.Arrays;

public class AggressiveCows {
    static boolean canWePlace(int[] stalls, int dist, int cows){
        int cntCows = 1;
        int last = stalls[0];

        for (int i = 1; i < stalls.length; i++) {
            if (stalls[i] - last >= dist) {
                cntCows++;
                last = stalls[i];
            }
            if (cntCows >= cows) {
                return true;
            }
        }
        return false;
    }

    static int aggressiveCows(int[] stalls, int k){
        Arrays.sort(stalls);
        int n = stalls.length;
        int low = 1;
        int high = stalls[n-1] - stalls[0];

        while(low <= high){
            int mid = low + (high - low) / 2;
            if(canWePlace(stalls, mid, k)){
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return high;
    }

    public static void main(String[] args) {
        int[] stalls = {0, 3, 4, 7, 10, 9};
        int k = 4;
        System.out.println("Maximum minimum distance: " + aggressiveCows(stalls, k));
    }
}
