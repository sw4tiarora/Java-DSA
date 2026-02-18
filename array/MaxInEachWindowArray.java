public class MaxInEachWindowArray {
    public static void main(String[] args) {
        int[] arr = {2,1,5,1,3,2};
        int l = 0, r = 0;
        int k = 3;
        while(r<arr.length){
            if((r-l+1)>k){
                l++;
            }
            if((r-l+1)==k){
                int maxi = Integer.MIN_VALUE; // reset for each window
                for (int i = l; i < l + k; i++) {
                    if(arr[i]>maxi){
                        maxi = arr[i];
                    }
                }
                System.out.print(maxi+ " ");
            }
            r++;
        }
    }
}
