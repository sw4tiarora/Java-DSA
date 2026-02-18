public class SubstringWithMaxSumArray {
    static void main(String[] args) {
        int[] arr = {2,1,5,1,3,2};
        int k = 3;
        int l = 0, r = 0, sum = 0;
        int maxSum = Integer.MIN_VALUE;
        int start = 0;
        while(r<arr.length){
            sum += arr[r];
            if((r-l+1)>k){
                sum -= arr[l];
                l++;
            }
            if((r-l+1)==k){
                if(sum>maxSum){
                    maxSum = sum;
                    start = l;
                }
            }
            r++;
        }
        System.out.println("Max Sum: "+maxSum);
        System.out.print("Subarray: ");
        for (int i = start; i < start + k; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
