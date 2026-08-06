import java.util.*;

public class CountSubsequencesSumK {
    private int helper(int ind, int sum, int[] nums){
        // Base case
        if(sum == 0) return 1;
        if(sum < 0 || ind == nums.length) return 0;

        return helper(ind + 1, sum - nums[ind], nums) + helper(ind + 1, sum, nums);
    }

    public int countSubsequences(int[] nums, int target){
        return helper(0, target, nums);
    }

    public static void main(String[] args) {
        CountSubsequencesSumK sol = new CountSubsequencesSumK();
        int[] nums = {1, 2, 3, 4};
        int target = 5;
        System.out.println("Number of subsequences with target sum " + target + ": "
                + sol.countSubsequences(nums, target));
    }
}
