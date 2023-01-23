class Solution {
    public int removeDuplicates(int[] nums) {
        int j = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] != nums[i + 1]) {
                nums[j++] = nums[i];
            }
        }
        nums[j++] = nums[nums.length - 1];

        return j;
    }

}

public class RemoveDuplicate {

    static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        int[] arr = { 1, 1, 1, 2, 2, 3, 4, 5, 5 };

        s.removeDuplicates(arr);
        printArray(arr);
    }
}