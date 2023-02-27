class Solution {
    public int majorityElement(int[] nums) {
        int element = 0, count = 0;

        for (int i=0; i<nums.length; i++){
            if (count == 0)
                element = nums[i];
            
            if (element == nums[i])
                count += 1;
            else
                count -= 1;
        }

        return element;
    }
}