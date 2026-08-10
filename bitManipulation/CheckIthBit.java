public class CheckIthBit {
    public boolean checkIthBit(int n, int i){
        return (n & (1 << i)) != 0;
    }

    public static void main(String[] args) {
        CheckIthBit obj = new CheckIthBit();
        int n = 13;
        int i = 2;
        if(obj.checkIthBit(n, i)){
            System.out.println("The " + i + "-th bit of " + n + " is set (1)");
        }
        else{
            System.out.println("The " + i + "-th bit of " + n + " is not set (0)");
        }
    }
}
