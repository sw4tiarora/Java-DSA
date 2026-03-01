import java.util.*;
public class LeadersInArray {

    public static List<Integer> superiorElements(int[] arr) {

        List<Integer> ans = new ArrayList<>();
        int maxi = Integer.MIN_VALUE;

        for (int i = arr.length - 1; i >= 0; i--) {

            if (arr[i] > maxi) {
                ans.add(arr[i]);
            }

            maxi = Math.max(maxi, arr[i]);
        }

        Collections.reverse(ans);

        return ans;
    }

    public static void main(String[] args) {

        int[] arr = {10, 22, 12, 3, 0, 6};

        List<Integer> result = superiorElements(arr);

        System.out.println("Superior Elements:");
        for (int num : result) {
            System.out.print(num + " ");
        }
    }
}