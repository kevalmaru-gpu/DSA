import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> sol = new ArrayList<>();
        
        for (int i=0; i<nums.length; i++){
            List<Integer> s = new ArrayList<>();
            for (int j=0; j<nums.length; j++){
                s.add(nums[j]);
            }
            sol.add(s);
        }

        return sol;
    }
}