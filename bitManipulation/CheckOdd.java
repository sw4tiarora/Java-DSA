public class CheckOdd {
    public boolean isOdd(int n){
        return (n & 1) != 0;
    }

    public static void main(String[] args) {
        CheckOdd obj = new CheckOdd();
        int n = 7;
        if(obj.isOdd(n)){
            System.out.println(n + " is odd");
        }
        else{
            System.out.println(n + " is not odd");
        }
    }
}
