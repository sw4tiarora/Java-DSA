public class LeastWeightCapacity {
    public static int findDays(int[] weights, int cap){
        int load = 0, days = 1;
        for (int i = 0; i < weights.length; i++) {
            if(weights[i] + load > cap){
                days+=1;
                load = weights[i];
            } else {
                load += weights[i];
            }
        }
        return days;
    }

    public static int leastWeightCapacity(int[] arr, int d){
        int low = 0;
        int high = 0;
        for(int num : arr){
            low = Math.max(low, num);
            high += num;
        }

        while(low <= high){
            int mid = (low + high) / 2;
            int noOfDays = findDays(arr, mid);
            if(noOfDays <= d){
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return low;
    }

    public static void main(String[] args) {
        int[] weights = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int days = 5;
        System.out.println("Least Capacity: " + leastWeightCapacity(weights, days));
    }
}
