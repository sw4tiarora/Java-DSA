public class MissingRepeatedNumber {
    public int[] answer(int[] a){
        long n = a.length;

        long SN = ( n * (n+1)) / 2;
        long S2N = ( n * (n+1) * (2*n+1)) / 6;

        long S = 0, S2 = 0;

        for (int i = 0; i < n; i++) {
            S += a[i];
            S2 += (long) a[i] * a[i];
        }

        long val1 = S - SN;
        long val2 = S2 - S2N;
        val2 = val2 / val1;

        long x = (val1 + val2) / 2;
        long y = x - val1;

        return new int[]{(int) x, (int) y};
    }

    public static void main(String[] args) {
        MissingRepeatedNumber obj = new MissingRepeatedNumber();
        int[] arr = {1, 2, 2, 4};

        int[] ans = obj.answer(arr);
        System.out.println("Repeating: " + ans[0]);
        System.out.println("Missing: " + ans[1]);
    }
}
