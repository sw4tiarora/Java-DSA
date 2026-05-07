import java.util.*;

public class KokoEatingBananas {
    public static int findMax(int[] v){
        int maxi = Integer.MIN_VALUE;
        for (int i = 0; i < v.length; i++) {
            maxi = Math.max(maxi, v[i]);
        }
        return maxi;
    }

    public static int calculateTotalHours(int[] v, int hourly){
        int totalH = 0;
        for(int i = 0; i < v.length; i++){
            totalH += Math.ceil((double) v[i] / (double) hourly);
        }
        return totalH;
    }

    public static int minimumRateToEatBananas(int[] v, int h){
        int low = 1, high = findMax(v);
        while(low <= high){
            int mid = (low + high) / 2;
            int totalH = calculateTotalHours(v, mid);
            if(totalH <= h){
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return low;
    }

    public static void main(String[] args) {
        int[] v = {3, 6, 7, 11};
        int h = 8;
        System.out.println(minimumRateToEatBananas(v, h));
    }
}
