public class CountInversions {
    public static int mergeSort(int[] arr, int left, int right) {
        int count = 0;

        if (left < right) {
            int mid = (left + right) / 2;

            count += mergeSort(arr, left, mid);
            count += mergeSort(arr, mid + 1, right);
            count += merge(arr, left, mid, right);
        }
        return count;
    }
    public static int merge(int[] arr, int left, int mid, int right){
        int[] temp = new int[right-left+1];

        int i = left;
        int j = mid+1;
        int k = 0;
        int count = 0;

        while(i<=mid && j<=right){
            if(arr[i]<=arr[j]){
                temp[k++] = arr[i++];
            }
            else{
                count += (mid - i + 1);
                temp[k++] = arr[j++];
            }
        }
        while(i<=mid){
            temp[k++] = arr[i++];
        }
        while(j<=right){
            temp[k++] = arr[j++];
        }
        for (int x = 0; x < temp.length; x++) {
            arr[left + x] = temp[x];
        }
        return count;
    }

    public static void main(String[] args) {
        int[] arr = {5, 3, 2, 4, 1};

        int inversions = mergeSort(arr, 0, arr.length - 1);

        System.out.println("Inversions: " + inversions);
    }
}
