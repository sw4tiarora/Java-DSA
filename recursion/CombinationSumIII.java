import java.util.ArrayList;
import java.util.List;

public class CombinationSumIII {
    private void helper(int k, int n, int ind, List<Integer> sum, List<List<Integer>> res){
        if(k == 0){
            if(n == 0){
                res.add(new ArrayList<>(sum));
            }
            return;
        }

        for (int i = ind; i <= Math.min(9, n); i++) {

            sum.add(i);
            helper(k - 1, n - i, i + 1, sum, res);
            sum.remove(sum.size() - 1);
        }
    }
    public List<List<Integer>> getSum(int k, int n){
        List<Integer> sum = new ArrayList<>();
        List<List<Integer>> res = new ArrayList<>();
        helper(k, n, 1, sum, res);
        return res;
    }
    public static void main(String[] args) {
        int k = 3;
        int n = 7;
        CombinationSumIII obj = new CombinationSumIII();
        List<List<Integer>> result = obj.getSum(k, n);
        System.out.println(result);
    }
}
