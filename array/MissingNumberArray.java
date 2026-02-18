public class MissingNumberArray {
    static void main(String[] args) {
        int[] arr = {1,2,4,5};
        int n = arr.length+1;
        int sum = (n*(n+1))/2;
        int sum2 = 0;
        for (int i = 0; i < n-1; i++) {
            sum2 = sum2 + arr[i];
        }
        System.out.println("Missing number: "+(sum-sum2));
    }
}
