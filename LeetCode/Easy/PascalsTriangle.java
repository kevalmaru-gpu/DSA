import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> sol = new ArrayList<>();
        List<Integer> prev = new ArrayList<>();
        
        prev.add(1);
        sol.add(prev);

        for (int i=2; i<=numRows; i++){
            List<Integer> row = new ArrayList<>();
            row.add(1);
            for (int j=0; j<prev.size() - 1; j++){
                row.add(prev.get(j) + prev.get(j + 1));
            }

            row.add(1);
            sol.add(row);
            prev = row;
        }

        return sol;
    }
}