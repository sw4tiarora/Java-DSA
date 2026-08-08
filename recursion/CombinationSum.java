import java.util.ArrayList;
import java.util.List;

public class CombinationSum {
    private void helper(int ind, int sum, int[] arr, List<Integer> curr, List<List<Integer>> res){
        // base case
        if(sum == 0){
            res.add(new ArrayList<>(curr)); // make a new list containing everything currently inside curr, and store that new list. (curr changes during backtracking)
            return;
        }

        if(ind == arr.length){
            return;
        }

        // take
        if(arr[ind] <= sum){
            curr.add(arr[ind]);
            sum -= arr[ind];
            helper(ind, sum, arr, curr, res);
            curr.remove(curr.size() - 1);
            sum += arr[ind];
        }

        // dont take
        helper(ind + 1, sum, arr, curr, res);

    }
    public static void main(String[] args) {
        int[] arr = {2, 3, 6, 7};
        int target = 7;

        List<Integer> curr = new ArrayList<>();
        List<List<Integer>> res = new ArrayList<>();

        CombinationSum obj = new CombinationSum();
        obj.helper(0, target, arr, curr, res);

        System.out.println(res);
    }
}
