import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SubsetSumII {
    private void helper(int i, int[] arr, List<Integer> subset, List<List<Integer>> res){
        res.add(new ArrayList<>(subset));
        // take
        for (int ind = i; ind < arr.length; ind++) {
            if(ind > i && arr[ind] == arr[ind - 1]){
                continue;
            }
            subset.add(arr[ind]);
            helper(ind + 1, arr, subset, res);
            subset.remove(subset.size() - 1);
        }
    }
    public List<List<Integer>> subsetsWithDup(int[] arr) {

        Arrays.sort(arr);

        List<List<Integer>> res = new ArrayList<>();
        List<Integer> subset = new ArrayList<>();

        helper(0, arr, subset, res);

        return res;
    }

    public static void main(String[] args) {
        SubsetSumII obj = new SubsetSumII();
        int[] arr = {1, 2, 2};
        List<List<Integer>> result = obj.subsetsWithDup(arr);
        System.out.println(result);
    }
}
