import java.util.HashMap;

class PrefixSum {
    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 1, 1, 1};
        int K = 3;

        HashMap<Integer, Integer> freq = new HashMap<>();

        // prefix sum 0 ek baar pehle se present (index 0 se start wale cases ke liye)
        freq.put(0, 1);

        int prefixSum = 0;
        int count = 0;

        for (int x : arr) {
            prefixSum += x;

            // jitni baar (prefixSum - K) aaya hai, utni subarrays milengi
            count += freq.getOrDefault(prefixSum - K, 0);

            // current prefixSum ka count badhao
            freq.put(prefixSum, freq.getOrDefault(prefixSum, 0) + 1);
        }

        System.out.println(count);
    }
}
