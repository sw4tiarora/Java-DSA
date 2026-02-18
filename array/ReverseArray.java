class ReverseArray{
    static int[] reverse(int[]  arr){
        int left = 0;
        int right = arr.length-1;
        while(left<=right){
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
        return arr;
    }
    static void main(String[] args) {
        int[] arr = {3,5,1,9,2};
        reverse(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]+" ");
        }
    }
}