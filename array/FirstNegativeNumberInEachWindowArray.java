import java.util.LinkedList;
import java.util.Queue;

public class FirstNegativeNumberInEachWindowArray {
    public static void main(String[] args) {

        int[] arr = {12, -1, -7, 8, -15, 30, 16, 28};
        int k = 3;

        int l = 0, r = 0;

        Queue<Integer> q = new LinkedList<>();

        while (r < arr.length) {

            // Add negative numbers to queue
            if (arr[r] < 0) {
                q.add(arr[r]);
            }

            // If window size > k, remove left element
            if ((r - l + 1) > k) {

                if (!q.isEmpty() && arr[l] == q.peek()) {
                    q.remove();
                }

                l++;
            }

            // If window size == k, print answer
            if ((r - l + 1) == k) {

                if (q.isEmpty()) {
                    System.out.println(0);
                } else {
                    System.out.println(q.peek());
                }
            }

            r++;
        }
    }
}
