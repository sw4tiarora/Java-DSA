import java.util.*;

public class RearrangeEleBySignVariety2 {
    public static int[] alternateNumbers(int[] a){
        ArrayList<Integer> pos = new ArrayList<>();
        ArrayList<Integer> neg = new ArrayList<>();

        for(int num:a){
            if(num>0){
                pos.add(num);
            } else {
                neg.add(num);
            }
        }

        if(pos.size()>neg.size()){
            for (int i = 0; i < neg.size(); i++) {
                a[2*i] = pos.get(i);
                a[2*i+1] = neg.get(i);
            }
            int index = neg.size()*2;

            for (int i = neg.size(); i < pos.size(); i++) {
                a[index] = pos.get(i);
                index++;
            }
        }
        else{
            for (int i = 0; i < pos.size(); i++) {
                a[2 * i] = pos.get(i);
                a[2 * i + 1] = neg.get(i);
            }
            int index = pos.size()*2;

            for (int i = pos.size(); i < neg.size(); i++) {
                a[index] = neg.get(i);
                index++;
            }
        }
        return a;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, -3, -1, -2, 3, 5, 8};

        int[] result = alternateNumbers(arr);

        System.out.println("Alternated Array:");
        for (int num : result) {
            System.out.print(num + " ");
        }
    }
}
