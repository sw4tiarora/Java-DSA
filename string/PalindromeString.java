import java.lang.String;
class PalindromeString{
    static void main(String[] args) {
        String s = "swati";
        char[] arr = s.toCharArray();
        int left = 0;
        int right = arr.length - 1;
        while(left<right){
            char temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
        String reversed = new String(arr);
        if(s.equals(reversed)){
            System.out.println("Palindrome");
        } else{
            System.out.println("No");
        }
    }
}