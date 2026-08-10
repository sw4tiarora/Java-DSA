import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SubsetSum {
    private void helper(int i, int n, int sum, int[] arr, List<Integer> res){
        if(i == n){
            res.add(sum);
            return;
        }
        // take
        helper(i + 1, n, sum + arr[i], arr, res);

        // don't take
        helper(i + 1, n, sum, arr, res);
    }

    public List<Integer> getSum(int[] arr, int n){
        List<Integer> res = new ArrayList<>();
        helper(0, n, 0, arr, res);
        Collections.sort(res);
        return res;
    }

    public static void main(String[] args) {
        int[] arr = {5, 2, 1};
        int n = arr.length;
        SubsetSum obj = new SubsetSum();
        List<Integer> result = obj.getSum(arr, n);
        System.out.println(result);
    }
}
