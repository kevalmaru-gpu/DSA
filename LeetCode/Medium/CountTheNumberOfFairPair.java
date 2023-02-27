import java.util.Arrays;

class Solution {
    public int BinarySearch(int[] nums, int left, int right, int key){
        int mid = 0;

        while (left <= right){
            mid = left + (right - left) / 2;

            if (key < nums[mid])
                right = mid - 1;
            else
                left = mid + 1;
        }
        return left;
    }

    public long countFairPairs(int[] nums, int lower, int upper) {
        Arrays.sort(nums);
        long count = 0, newUp, newLow;

        for (int i=0; i<nums.length; i++){
            newUp = upper - nums[i];
            newLow = lower - nums[i] - 1;

            int a = BinarySearch(nums, i+1, nums.length - 1, newUp);
            int b = BinarySearch(nums, i+1, nums.length - 1, newLow);

            count += a - b;
        }
        return count;
    }
}

public class CountTheNumberOfFairPair{
    public static void main(String[] args) {
        Solution s = new Solution();
        int[] nums = { 0, 0, 0, 0, 0, 0};

        System.out.println(s.countFairPairs(nums, 0, 0));
    }
}