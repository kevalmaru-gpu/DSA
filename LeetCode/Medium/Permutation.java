import java.util.*;

class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();
        List<Integer> tList = new ArrayList<>();

        Backtracking(list, tList, new boolean[nums.length], nums);

        return list;
    }

    void Backtracking(List<List<Integer>> list, List<Integer> tList, boolean[] used,int[] nums){
        if (tList.size() == nums.length){
            list.add(new ArrayList<>(tList));
            return;
        }
        else{
            for (int i=0; i<nums.length; i++){
                if (used[i]) continue;

                used[i] = true;
                tList.add(nums[i]);

                Backtracking(list, tList, used, nums);

                used[i] = false;
                tList.remove(tList.size() - 1);
            }
        }
    }
}

public class Permutation{
    public static void main(String[] args) {
        int[] n = {1, 2, 3};

        Solution s = new Solution();

        s.permute(n);
    }
}