public class MajorityElement {
    public static void main(String[] args) {
        int[] arr = {7,7,5,7,5,1,5,7,5,5,7,7,5,5,5,5};
        int count = 0;
        int ele = 0;
        for (int i = 0; i < arr.length; i++) {
            if(count==0){
                count = 1;
                ele = arr[i];
            }
            else if(arr[i]==ele){
                count++;
            }
            else {
                count--;
            }
        }
        count = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==ele){
                count++;
            }
        }
        if(count>arr.length/2){
            System.out.println("Majority Element: " + ele);
        }
        else{
            System.out.println("No Majority Element");
        }
    }
}

// this is when majority is not guaranteed
// if majority is guaranteed then no second loop needed
