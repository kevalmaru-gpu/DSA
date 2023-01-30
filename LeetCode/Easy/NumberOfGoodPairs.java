import java.util.HashMap;

class Solution {
    public int numIdenticalPairs(int[] nums) {
        int count = 0, frquency = 0;
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int n : nums){
            frquency = map.getOrDefault(n, 0);
            count += frquency;
            map.put(n, frquency + 1);
        }

        return count;
    }
}

public class NumberOfGoodPairs{
    public static void main(String[] args) {
        Solution s = new Solution();
        int[] nums = {1,2,3,1,1,3};
        System.out.println(s.numIdenticalPairs(nums));
    }
}