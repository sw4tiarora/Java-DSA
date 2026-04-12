import java.util.*;

public class MergeSortedArr {
    public void merge(long[] arr1, long[] arr2, int n, int m){
        int left = n - 1, right = 0;
        while(left>=0 && right<m){
            if(arr1[left] > arr2[right]){
                long temp = arr1[left];
                arr1[left] = arr2[right];
                arr2[right] = temp;
                left--;
                right++;
            } else{
                break;
            }
        }
        Arrays.sort(arr1);
        Arrays.sort(arr2);
    }
    public static void main(String[] args) {
        MergeSortedArr obj = new MergeSortedArr();

        long[] arr1 = {1, 4, 7, 8};
        long[] arr2 = {2, 3, 9};

        int n = arr1.length;
        int m = arr2.length;

        obj.merge(arr1, arr2, n, m);

        // print results
        System.out.println("arr1: " + Arrays.toString(arr1));
        System.out.println("arr2: " + Arrays.toString(arr2));
    }
}
