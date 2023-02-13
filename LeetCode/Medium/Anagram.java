import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> map = new HashMap<>();

        for (String s : strs){
            char[] ca = s.toCharArray();
            Arrays.sort(ca);
            String keyString = String.valueOf(ca);

            if (!map.containsKey(keyString)) map.put(keyString, new ArrayList<>());
            map.get(keyString).add(s);
        }

        return new ArrayList<>(map.values());
    }
}