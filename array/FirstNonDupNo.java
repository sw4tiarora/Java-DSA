import java.util.HashMap;

class FirstNonDupNo{
    static void main(String[] args) {
        int[] arr = {1,1,2,2,3,4};
        HashMap<Integer,Integer> freq = new HashMap<>();
        for (int k : arr) {
            freq.put(k, freq.getOrDefault(k, 0) + 1);
        }
        for (int j : arr) {
            if ((freq.get(j) == 1)) {
                System.out.println(j);
                break;
            }
        }
    }
}