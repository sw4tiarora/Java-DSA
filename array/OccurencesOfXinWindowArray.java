public class OccurencesOfXinWindowArray {
    public static void main(String[] args) {
        int[] arr = {1,2,1,3,1};
        int k = 3, x = 1;
        int l = 0, r = 0, count = 0;
        while(r<arr.length){
            if(arr[r]==x){
                count++;
            }
            if((r-l+1)>k){
                if(arr[l]==x){
                    count--;
                }
                l++;
            }
            if((r-l+1)==k){
                System.out.println(count);
            }
            r++;
        }
    }
}
