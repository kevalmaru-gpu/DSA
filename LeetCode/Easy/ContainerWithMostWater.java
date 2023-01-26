class Solution {
    public int maxArea(int[] height) {
        int max, l = 0, r = height.length - 1;

        while (l < r) {
            max = Math.max(max, Math.min(height[l], height[r]) * (l - r));

            if (height[l] < height[r]) {
                l++;
            } else {
                r--;
            }
        }

        return max;
    }
}