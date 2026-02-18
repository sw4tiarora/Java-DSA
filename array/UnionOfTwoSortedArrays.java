public class UnionOfTwoSortedArrays {
    static void main(String[] args) {
        int [] arr1 = {1,1,2,3,4,5};
        int[] arr2 = {2,3,4,4,5,6};
        int i = 0, j = 0;
        System.out.println("Union");
        while(i < arr1.length && j < arr2.length){
            if(i>0 && arr1[i]==arr1[i-1]){
                i++;
                continue;
            }
            if(j>0 && arr2[j]==arr2[j-1]){
                j++;
                continue;
            }
            if(arr1[i]<arr2[j]){
                System.out.print(arr1[i]+" ");
                i++;
            }
            else if(arr1[i]>arr2[j]){
                System.out.print(arr2[j]+" ");
                j++;
            }
            else{ //equal
                System.out.print(arr1[i]+" ");
                i++;
                j++;
            }
        }
        while(i<arr1.length){
            if(i==0 || arr1[i]!=arr1[i-1]){
                System.out.print(arr1[i]+ " ");
            }
            i++;
        }
        while(j<arr2.length){
            if(j==0 || arr2[j]!=arr2[j-1]){
                System.out.print(arr2[j]+ " ");
            }
            j++;
        }
    }
}


/* import java.util.*;

public class UnionOfTwoSortedArrays {

    public static ArrayList<Integer> union(int[] arr1, int[] arr2) {

        int i = 0, j = 0;
        ArrayList<Integer> result = new ArrayList<>();

        while (i < arr1.length && j < arr2.length) {

            if (i > 0 && arr1[i] == arr1[i - 1]) {
                i++;
                continue;
            }

            if (j > 0 && arr2[j] == arr2[j - 1]) {
                j++;
                continue;
            }

            if (arr1[i] < arr2[j]) {
                result.add(arr1[i++]);
            }
            else if (arr1[i] > arr2[j]) {
                result.add(arr2[j++]);
            }
            else {
                result.add(arr1[i]);
                i++;
                j++;
            }
        }

        while (i < arr1.length) {
            if (i == 0 || arr1[i] != arr1[i - 1]) {
                result.add(arr1[i]);
            }
            i++;
        }

        while (j < arr2.length) {
            if (j == 0 || arr2[j] != arr2[j - 1]) {
                result.add(arr2[j]);
            }
            j++;
        }

        return result; // ✅ THIS is what interviewer wants
    }
}
*/