import java.util.Arrays;

public class Sort012 {
    void sortArray(int[] arr, int n) {
        int low = 0, mid = 0, high = n-1;
        while(mid<=high){
            if(arr[mid]==0){
                int temp = arr[low];
                arr[low] = arr[mid];
                arr[mid] = temp;
                low++;
                mid++;
            }
            else if(arr[mid]==1){
                mid++;
            }
            else{
                int temp = arr[mid];
                arr[mid] = arr[high];
                arr[high] = temp;
                high--;
            }
        }
    }

    public static void main(String[] args) {
        int arr[] = {2, 0, 2, 1, 1, 0};
        Sort012 obj = new Sort012();
        System.out.println("Before Sorting: " + Arrays.toString(arr));
        obj.sortArray(arr, arr.length);
        System.out.println("After Sorting: " + Arrays.toString(arr));
    }
}
