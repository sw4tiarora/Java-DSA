class BinarySearch{
    static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int low = 0;
        int high = arr.length-1;
        int mid = 0;
        int key = 4;
        boolean found = false;
        while(low<=high){
            mid = low + (high-low) /2;
            if(arr[mid]==key){
                System.out.println("Key found at "+mid);
                found = true;
                break;
            } else if(key>arr[mid]){
                low = mid + 1;
            } else{
                high = mid - 1;
            }
        }
        if(!found){
            System.out.println("Not found");
        }
    }
}