// gap method

import java.util.Arrays;

public class ArrMergeSorted {

    private void swapIfGreater(long[] arr1, long[] arr2, int i, int j){
        if(arr1[i] > arr2[j]){
            long temp = arr1[i];
            arr1[i] = arr2[j];
            arr2[j] = temp;
        }
    }

    public void merge(long[] arr1, long[] arr2, int n, int m){
        int len = n + m;
        int gap = (len/2) + (len%2);
        while(gap>0){
            int left = 0;
            int right = left + gap;
            while(right<len){

                //arr1 and arr2
                if(left<n && right>=n){
                    swapIfGreater(arr1, arr2, left, right - n);
                } 
                //arr2 and arr2
                else if(left>=n){
                    swapIfGreater(arr2, arr2, left - n, right - n);
                }
                //arr1 and arr1
                else{
                    swapIfGreater(arr1, arr1, left, right);
                }
                left++;
                right++;
            }
            if(gap==1) break;
            gap = (gap/2)+(gap%2);
        }
    }

    public static void main(String[] args) {
        ArrMergeSorted obj = new ArrMergeSorted();

        long[] arr1 = {1, 4, 7, 8};
        long[] arr2 = {2, 3, 9};

        obj.merge(arr1, arr2, arr1.length, arr2.length);

        System.out.println("arr1: " + Arrays.toString(arr1));
        System.out.println("arr2: " + Arrays.toString(arr2));
    }
}
