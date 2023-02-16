public class MedianOfTwoSortedArrays {
    public static void main(String[] args) {
        Solution s = new Solution();
        int[] a = {1, 2};
        int[] b = {3, 4};

        s.findMedianSortedArrays(a, b);
    }    
}
class Solution {
    public void print(int[] arr){
        for (int i=0; i<arr.length; i++){
            System.out.println(arr[i]);
        }
    }
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int i = 0, k = 0, j = 0, m = nums1.length, n = nums2.length;
        int[] sorted = new int[n + m];

        while (i < m && j < n){
            if (nums1[i] <= nums2[j]){
                sorted[k] = nums1[i];
                i++; k++;
            }
            else{
                sorted[k] = nums2[j];
                j++; k++;
            }
        }

        while (i < m){
            sorted[k] = nums1[i];
            i++; k++;
        }
        while (j < n){
            sorted[k] = nums2[j];
            j++; k++;
        }

        int mid = (m + n - 1) / 2;
        double med = (m + n) % 2 == 0 ? (double)((sorted[mid] + sorted[mid + 1]) / 2) : (sorted[mid] * 2) / 2;
        
        return med;
    }
}