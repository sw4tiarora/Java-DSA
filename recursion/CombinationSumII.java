import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

public class CombinationSumII {
    private void helper(int ind, int sum, int[] arr, List<Integer> curr, List<List<Integer>> res){
        // base case
        if(sum == 0){
            res.add(new ArrayList<>(curr));
            return;
        }
        for (int i = ind; i < arr.length; i++) {
            if(i > ind && arr[i] == arr[i - 1]){
                continue;
            }
            if(arr[i] > sum){
                break;
            }
            // take
            curr.add(arr[i]);
            helper(i + 1, sum - arr[i], arr, curr, res);
            // backtrack
            curr.remove(curr.size() - 1);
        }
    }

    public List<List<Integer>> combinationSum2(int[] candidates, int target) {

        Arrays.sort(candidates);

        List<Integer> curr = new ArrayList<>();
        List<List<Integer>> res = new ArrayList<>();

        helper(0, target, candidates, curr, res);

        return res;
    }

    public static void main(String[] args) {
        CombinationSumII obj = new CombinationSumII();
        int[] arr = {10, 1, 2, 7, 6, 1, 5};
        int target = 8;
        System.out.println(obj.combinationSum2(arr, target));
    }
}
