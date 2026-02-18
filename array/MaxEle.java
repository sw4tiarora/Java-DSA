class MaxEle{
    static int findMax(int[]  arr){
        int max = arr[0];
        for(int x : arr){
            if(x>max){
                max = x;
            }
        }
        return max;
    }
    static void main(String[] args) {
        int[] arr = {3,5,1,9,2};
        int maxElement = findMax(arr);
        System.out.println("Maximum Element: "+maxElement);
    }
}