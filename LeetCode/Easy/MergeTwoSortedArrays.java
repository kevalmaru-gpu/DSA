class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] a = nums1.clone();

        int i = 0, j = 0, k = 0;

        while (i < m && j < n){
            if (a[i] <= nums2[j]){
                nums1[k] = a[i];
                // System.out.printf("nums1 %d %d\n", i, a[i]);
                i++; k++;
            }
            else{
                nums1[k] = nums2[j];
                // System.out.printf("nums2 %d %d\n", j, nums2[j]);
                j++; k++;
            }
        }

        while (i < m){
            nums1[k] = a[i];
            // System.out.printf("nums1 %d %d\n", j, nums2[j]);
            i++; k++;
        }

        while (j < n){
            nums1[k] = nums2[j];
            // System.out.printf("nums2 %d %d\n", j, a[j]);
            j++; k++;
        }
    }
}

public class MergeTwoSortedArrays{
    public static void main(String[] args) {
        Solution s = new Solution();

        int[] arr1 = {1,2,3,0,0,0};
        int[] arr2 = {2,5,6};

        s.merge(arr1, 3, arr2, 3);
    }
}