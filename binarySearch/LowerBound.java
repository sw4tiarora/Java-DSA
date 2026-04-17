public class LowerBound {
    public static int lowerBound(int[] arr, int n, int x){
        int low = 0, high = n - 1;
        int ans = n;

        while(low <= high){
            int mid = low + (high - low) / 2;

            if(arr[mid] >= x){
                ans = mid;
                high = mid - 1;
            }
            else{
                low = mid + 1;
            }
        }
        return ans;
    }
    public static void main(String[] args){
        int[] arr = {1, 3, 3, 5, 7};
        int x = 3;

        int index = lowerBound(arr, arr.length, x);
        System.out.println("Lower bound index: " + index);
    }
}
