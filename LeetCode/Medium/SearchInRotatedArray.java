class SearchInRotatedArray {
    public int search(int[] nums, int target) {
        if (nums.length == 0) return -1;
        int l = 0, m, r = nums.length - 1;

        while (l < r){
            m = (l + r) / 2;
            if (nums[m] > nums[r]){
                l = m + 1;
            }
            else{
                r = m;
            }
        }

        int s = l;
        l = 0; r = nums.length - 1;

        if (target >= nums[s] && target <= nums[r]){
            l = s;
        }
        else{
            r = s;
        }

        while (l <= r){
            m = (l + r) / 2;

            if (nums[m] == target) return m;
            else if(nums[m] > target) r = m - 1;
            else l = m + 1;
        }

        return -1;
    }
}