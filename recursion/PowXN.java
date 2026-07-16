public class PowXN {
    private double power(double x, long n){
        if(n == 0)
            return 1.0;

        if(n % 2 == 0)
            return power(x * x, n / 2);

        return x * power(x, n - 1);
    }

    public double myPow(double x, int n){
        long  N = n;

        if(N < 0){
            x = 1 / x;
            N = -N;
        }

        return power(x, N);
    }

    public static void main(String[] args) {
        PowXN sol = new PowXN();

        System.out.printf("%.4f\n", sol.myPow(2.0, 10));   // 1024.0000
        System.out.printf("%.4f\n", sol.myPow(2.0, -2));   // 0.2500
        System.out.printf("%.4f\n", sol.myPow(3.0, 5));    // 243.0000
        System.out.printf("%.4f\n", sol.myPow(5.0, 0));    // 1.0000
    }
}
