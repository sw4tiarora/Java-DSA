public class MaxSumSubArray {
    static void main(String[] args) {
        int[] arr = {2,1,5,1,3,2};
        int k = 3, l = 0, r = 0, sum = 0, maxSum = Integer.MIN_VALUE;
        while(r<arr.length){
            sum+=arr[r];
            if((r-l+1)>k){
                sum-=arr[l];
                l++;
            }
            if((r-l+1)==k){
                maxSum = Math.max(maxSum, sum);
            }
            r++;
        }
        System.out.println(maxSum);
    }
}
