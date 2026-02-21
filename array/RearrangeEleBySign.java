import java.util.Arrays;
public class RearrangeEleBySign {
    public static int[] rearrangeArray(int[] nums){
        int n = nums.length;
        int[] ans = new int[n];
        int posIndex = 0, negIndex = 1;
        for (int i = 0; i < n; i++) {
            if(nums[i]<0){
                ans[negIndex]=nums[i];
                negIndex+=2;
            }
            else{
                ans[posIndex]=nums[i];
                posIndex+=2;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] nums = {3, 1, -2, -5, 2, -4};
        int[] result = rearrangeArray(nums);
        System.out.println("Rearranged array:");
        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i]+" ");
        }
    }
}
