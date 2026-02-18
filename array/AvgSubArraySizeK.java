public class AvgSubArraySizeK {
    static void main(String[] args) {
        int[] arr = {2,1,5,1,3,2};
        int k = 3;
        int l = 0, r = 0, sum = 0;
        double avg = 0;
        while(r<arr.length){
           sum += arr[r];
           if((r-l+1)>k){
               sum -= arr[l];
               l++;
           }
           if((r-l+1)==k){
               avg = (double) sum / k;
               System.out.println(avg);
           }
           r++;
        }
    }
}
