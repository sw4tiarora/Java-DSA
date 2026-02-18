import java.util.HashMap;
import java.util.Map;

class Frequency{
    static void main(String[] args) {
        int[] arr = {1,1,2,2,3,4,4,};
        int n = arr.length;
        HashMap<Integer, Integer> freq = new HashMap<>();
        for(int x : arr){
            freq.put(x, freq.getOrDefault(x,0)+1);
        }
        for(Map.Entry<Integer,Integer> entry : freq.entrySet()){
            System.out.println(entry.getKey()+" -> "+ entry.getValue());
        }
    }
}