public class RemoveElement {
    public int removeElement(int[] nums, int val) {
        int count = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] != val){
                nums[count] = nums[i];
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        RemoveElement obj = new RemoveElement();

        int[] nums = {3, 2, 2, 3};
        int val = 3;

        int k = obj.removeElement(nums, val);

        System.out.println("k = " + k);
        System.out.print("Array after removal: ");

        for (int i = 0; i < k; i++) {
            System.out.print(nums[i] + " ");
        }
    }
}