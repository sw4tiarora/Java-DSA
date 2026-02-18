public class FindingSingleNumber {
    static void main(String[] args) {
        int[] arr = {1,1,2,3,3,4,4};
        int xor = 0;
        for (int j : arr) {
            xor ^= j;
        }
        System.out.println(xor);
    }
}
