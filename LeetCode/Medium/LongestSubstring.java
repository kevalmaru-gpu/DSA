import java.util.HashSet;

class Solution {
    int longestSubString(String s){
        int max = 0, count = 0;

        HashSet<Character> set = new HashSet<>();

        for (int i=0; i<s.length(); i++){
            int j = i + 1;
            count++;
            set.add(s.charAt(i));

            if (j < s.length()){
                try{
                    while (!set.contains(s.charAt(j))){
                        set.add(s.charAt(j));
                        j++;    
                        count++;
                    }
                    set.clear();
                    max = Math.max(max, count);
                    count = 0;
                }
                catch (StringIndexOutOfBoundsException e){
                    set.clear();
                    max = Math.max(max, count);
                    count = 0;
                    continue;
                }
            }
        }
        max = Math.max(max, count);
        return max;
    }

    public int lengthOfLongestSubstring(String s) {
        return longestSubString(s);
    }
}

public class LongestSubstring{
    public static void main(String[] args) {
        Solution s = new Solution();
        String c = " ";

        System.out.println(s.lengthOfLongestSubstring("pwwkew"));
    }
}