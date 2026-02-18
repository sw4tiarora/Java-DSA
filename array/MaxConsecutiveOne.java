public class MaxConsecutiveOne {
    static void main(String[] args) {
        int[] arr = {1,1,0,1,1,1,0,1,1};
        int maxi = 0;
        int count = 0;
        for (int x : arr) {
            if (x == 1) {
                count++;
                maxi = Math.max(maxi, count);
            } else {
                count = 0;
            }
        }
        System.out.println(maxi);
    }
}
