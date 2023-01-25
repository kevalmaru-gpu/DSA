class Solution {
    int search(int[] arr, int key, int l, int r) {
        int m = (l + r) / 2;

        System.out.printf("%d, %d, %d\n", l, m, r);

        if (l <= r) {
            if (key == arr[m]) {
                return m;
            } else if (key < arr[m]) {
                return search(arr, key, l, m - 1);
            } else if (key > arr[m]) {
                return search(arr, key, m + 1, r);
            }
        }

        return r + 1;
    }

    public int searchInsert(int[] nums, int target) {
        return search(nums, target, 0, nums.length - 1);
    }
}

public class SearchInsertedPosition {
    public static void main(String[] args) {
        int[] arr = { 1, 3 };
        Solution s = new Solution();

        System.out.println(s.searchInsert(arr, 0));
    }
}