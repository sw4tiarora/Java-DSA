public class LongestSubArraySumK {
    static void main(String[] args) {
        int[] arr = {1,2,1,1,1};
        int k = 3;
        int l = 0, r = 0, sum = 0;
        int maxLength = 0;
        while(r<arr.length){
            sum += arr[r];
            while(sum>k){
                sum -= arr[l];
                l++;
            }
            if(sum==k){
                maxLength = Math.max(maxLength, r-l+1);
            }
            r++;
        }
        System.out.println(maxLength);
    }
}
