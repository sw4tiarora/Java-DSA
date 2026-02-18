public class MissingNumberArray2 {
    static void main(String[] args) {
        int[] arr = {1,2,4,5};
        int N = arr.length + 1;
        int xor1 = 0, xor2 = 0;
        for (int i = 0; i < arr.length; i++) {
            xor2^=arr[i];
            xor1^=(i+1);
        }
        xor1=xor1^N;
        int missing=xor1^xor2;
        System.out.println(missing);
    }
}
