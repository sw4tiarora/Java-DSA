import java.util.*;

public class ExistsSubsequenceSumK {
    private boolean helper(int i, int n, int[] arr, int k){
        if(k == 0) return true;
        if(k < 0) return false;
        if(i == n) return k == 0;

        return helper(i + 1, n, arr, k - arr[i]) || helper(i + 1, n, arr, k);
    }

    public boolean existsSubsequenceSum(int[] nums, int target){
        int n = nums.length;
        return helper(0, n, nums, target);
    }

    public static void main(String[] args) {
        ExistsSubsequenceSumK sol = new ExistsSubsequenceSumK();
        int[] nums = {1, 2, 3, 4};
        int target = 5;
        System.out.println("Subsequence with target sum " + target + " exists: "
                + sol.existsSubsequenceSum(nums, target));
    }
}
