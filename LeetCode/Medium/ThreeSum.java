import java.util.*;

class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Set<List<Integer>> sol = new HashSet<>();
        HashMap<Integer, Integer> map = new HashMap();
        int n = nums.length;
        Arrays.sort(nums);

        for (int i=0; i<n; i++){
            map.put(nums[i], i);
        }

        for (int i=0; i<n; i++){
            int a = nums[i];
            for (int j=i+1; j<n; j++){
                int b = nums[j];
                int c = 0 - a - b;

                if (map.containsKey(c) && map.get(c) > j){
                    List<Integer> s = new ArrayList<>();

                    s.add(a);
                    s.add(b);
                    s.add(c);
                    if(!sol.contains(s)){
                        sol.add(s);
                    }
                }
            }
        }

        return new ArrayList(sol);
    }
}

public class ThreeSum{
    public static void main(String[] args) {
        int[] nums = { -2,0,1,1,2};
        Solution s = new Solution();

        s.threeSum(nums);
    }
}
