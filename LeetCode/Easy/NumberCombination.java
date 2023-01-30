import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

class Solution {
    HashMap<Integer, String> map = new HashMap<>();

    void map(){
        map.put(2, "abc");
        map.put(3, "def");
        map.put(4, "ghi");
        map.put(5, "jkl");
        map.put(6, "mno");
        map.put(7, "pqrs");
        map.put(8, "tuv");
        map.put(9, "wxyz");
    }

    public List<String> letterCombinations(String digits) {
        Set<String> sol = new HashSet();
        int n = digits.length() - 1;
        this.map();

        if ((n + 1) <= 0)
            return new ArrayList(sol);

        int a = n >= 0 ? Character.getNumericValue(digits.charAt(0)) : -1;
        int b = n >= 1 ? Character.getNumericValue(digits.charAt(1)) : -1;
        int c = n >= 2 ? Character.getNumericValue(digits.charAt(2)) : -1;
        int d = n >= 3 ? Character.getNumericValue(digits.charAt(3)) : -1;

        String s = "";
        for (int i=0; i<map.get(a).length(); i++){
            s += map.get(a).charAt(i);
            if (b != -1){
                for (int j=0; j<map.get(b).length(); j++){
                    s += map.get(b).charAt(j);
                    if (c != -1){
                        for (int k=0; k<map.get(c).length(); k++){
                            s += map.get(c).charAt(k);
                            if (d != -1){
                                for (int l=0; l<map.get(d).length(); l++){
                                    s += map.get(d).charAt(l);
                                    sol.add(s);
                                    s = s.substring(0, s.length() - 1);
                                }
                            }
                            else{
                                sol.add(s);
                            }
                            s = s.substring(0, s.length() - 1);
                        }
                    }
                    else{
                        sol.add(s);
                    }
                    s = s.substring(0, s.length() - 1);
                }
            }
            else{
                sol.add(s);
            }
            s = s.substring(0, s.length() - 1);
        }

        return new ArrayList(sol);
    }
}

public class NumberCombination{
    public static void main(String[] args) {
        Solution s = new Solution();

        s.letterCombinations("5678");
    }
}